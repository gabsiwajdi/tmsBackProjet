package com.Tmsreview.tms.Services.TMS;


import com.Tmsreview.tms.Models.RH.Employe;
import com.Tmsreview.tms.Models.TMS.Vehicule;
import com.Tmsreview.tms.Repository.TMS.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Service
public class VehiculeServices {

    @Autowired
    VehiculeRepository repository;

    @Autowired
    DataSource dataSource ;

    // recuperer la liste de tous les vehicules
    public List<Vehicule> tousVehicule(){return  repository.findAll();}

    // recuperer une vehicule par id
    public Vehicule vehicule(Long idVehicule){
        Vehicule vehicule = repository.findById(idVehicule)
                .orElseThrow(() -> new NoSuchElementException("Aucune vehicule trouvé avec l'ID : " + idVehicule));
        return vehicule ;
    }

    // creer un employe
    public Vehicule creerVehicule(Vehicule vehicule){return repository.save(vehicule);}


    // supprimer employe
    public ResponseEntity<Map<String, Boolean>> supprimerVehicule(Long idVehicule) {
        Vehicule vehicule= repository.findById(idVehicule).orElseThrow(() -> new NoSuchElementException("Aucun vehicule trouvé avec l'ID : " + idVehicule));
        repository.delete(vehicule);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }


    // modifier vehicule
    public Vehicule modifieVehicule(Vehicule vehicule) {
        Vehicule v = repository.findById(vehicule.getIdVehicule())
                .orElseThrow(() -> new NoSuchElementException("Aucun employé trouvé avec l'ID:" + vehicule.getIdVehicule()));
        v.setKmactuel(vehicule.getKmactuel());
        v.setReservoir(vehicule.getReservoir());
        v.setDatetaxe(vehicule.getDatetaxe());
        v.setDateassurance(vehicule.getDateassurance());
        v.setDatevisite(vehicule.getDatevisite());
        v.setKilometrageProchainVidangeHuileMoteur(vehicule.getKilometrageProchainVidangeHuileMoteur());
        v.setKilometrageProchainVidangeLiquideRefroidissement(vehicule.getKilometrageProchainVidangeLiquideRefroidissement());
        v.setKilometrageProchainVidangeHuileBoiteVitesse(vehicule.getKilometrageProchainVidangeHuileBoiteVitesse());
        v.setKilometrageProchainChangementFiltreClimatiseur(vehicule.getKilometrageProchainChangementFiltreClimatiseur());
        v.setKilometrageProchainChangementFiltreCarburant(vehicule.getKilometrageProchainChangementFiltreCarburant());
        v.setKilometrageProchainChangementBougies(vehicule.getKilometrageProchainChangementBougies());
        v.setKilometrageProchainChangementCourroies(vehicule.getKilometrageProchainChangementCourroies());
        v.setKilometrageProchainChangementPneus(vehicule.getKilometrageProchainChangementPneus());
        v.setDescription(vehicule.getDescription());

        return repository.save(v);
    }

}
