package com.Tmsreview.tms.Services.RH;


import com.Tmsreview.tms.Models.RH.Employe;
import com.Tmsreview.tms.Repository.RH.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


@Service
public class EmployeService {

    @Autowired
    EmployeRepository repository ;

    @Autowired
    DataSource dataSource ;


    // recuperer la liste de tous les employes
    public List<Employe> tousEmployes(){return  repository.findAll();}

    // recuperer un employe par id
    public Employe employe(Long idEmployee){
        Employe employe = repository.findById(idEmployee)
                .orElseThrow(() -> new NoSuchElementException("Aucun employé trouvé avec l'ID : " + idEmployee));
        return employe ;
    }

    // creer un employe
    public Employe creerEmploye(Employe employe){return repository.save(employe);}


    // supprimer employe
    public ResponseEntity<Map<String, Boolean>> supprimerEmploye(Long idEmploye) {
        Employe employe= repository.findById(idEmploye).orElseThrow(() -> new NoSuchElementException("Aucun employé trouvé avec l'ID : " + idEmploye));
        repository.delete(employe);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    // modifier Employe
    public Employe modifieEmploye(Employe employe) {
        Employe e = repository.findById(employe.getIdEmployee())
                .orElseThrow(() -> new NoSuchElementException("Aucun employé trouvé avec l'ID:" + employe.getIdEmployee()));
        e.setDateExpirationPermis(employe.getDateExpirationPermis());
        e.setBanque(employe.getBanque());
        e.setRib(employe.getRib());
        e.setCategoriePermis(employe.getCategoriePermis());
        e.setSituationFamiliale(employe.getSituationFamiliale());
        e.setEnfantCharge(employe.getEnfantCharge());
        e.setPosteEmploye(employe.getPosteEmploye());
        e.setAdress(employe.getAdress());
        e.setTel(employe.getTel());
        e.setDatePieceIdentite(employe.getDatePieceIdentite());

        return repository.save(e);
    }



// filtre employe
    public List<Employe> filtre(String Champ1, String Valeur1, String Champ2, String Valeur2, String Champ3, String Valeur3, String Champ4, String Valeur4, String Champ5, String Valeur5) {
        List<Employe> liste = new ArrayList<>();
        try {

            String query = "SELECT * FROM employe WHERE LOWER(" + Champ1 + ") LIKE LOWER('" + Valeur1 + "%') AND " +
                    "LOWER(" + Champ2 + ") LIKE LOWER('" + Valeur2 + "%') AND " +
                    "LOWER(" + Champ3 + ") LIKE LOWER('" + Valeur3 + "%') AND " +
                    "LOWER(" + Champ4 + ") LIKE LOWER('" + Valeur4 + "%') AND " +
                    "LOWER(" + Champ5 + ") LIKE LOWER('" + Valeur5 + "%');";

            Connection cnx = dataSource.getConnection();
            Statement stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Employe e = new Employe();
                e.setNom(rs.getString("nom"));
                e.setPrenom(rs.getString("prenom"));
                e.setPosteEmploye(rs.getString("poste_Employe"));
                e.setCategoriePermis(rs.getString("categorie_Permis"));
                e.setVille(rs.getString("ville"));

                liste.add(e);
            }
            stmt.close();
            cnx.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return liste;
    }






















}
