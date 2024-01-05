package com.Tmsreview.tms.Services.RH;


import com.Tmsreview.tms.Models.RH.Employe;
import com.Tmsreview.tms.Repository.RH.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;


@Service
public class EmployeService {

    @Autowired
    EmployeRepository repository ;

    @Autowired
    DataSource dataSource ;


    // recuperer la liste de tous les employes
    public List<Employe> tousEmployes(){return  repository.findAll();}

    // recuperer un employe par id
    public Employe employe(Long idEmploye){
        Employe employe = repository.findById(idEmploye)
                .orElseThrow(() -> new NoSuchElementException("Aucun employé trouvé avec l'ID : " + idEmploye));
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
        return repository.save(e);
    }













}
