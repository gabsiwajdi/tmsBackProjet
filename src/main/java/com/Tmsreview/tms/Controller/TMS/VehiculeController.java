package com.Tmsreview.tms.Controller.TMS;

import com.Tmsreview.tms.Models.RH.Employe;
import com.Tmsreview.tms.Models.TMS.Vehicule;
import com.Tmsreview.tms.Services.TMS.VehiculeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class VehiculeController {
    @Autowired
    VehiculeServices service;

    @RequestMapping(value = "/vehicules", method = RequestMethod.GET)
    public List<Vehicule> tousVehicule(){
        return service.tousVehicule();
    }


    @RequestMapping(value = "/vehicule", method = RequestMethod.GET)
    public Vehicule vehicule(@RequestParam Long idVehicule) {
        return service.vehicule (idVehicule);
    }


    @PostMapping("/creer-vehicule")
    public Vehicule creeVehicule(@RequestBody Vehicule vehicule) throws Exception {
        return service.creerVehicule(vehicule);
    }

    @PutMapping("/modifier-vehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule ) {
        return service.modifieVehicule(vehicule);
    }

    @DeleteMapping("/supprimer-vehicule")
    public ResponseEntity<Map<String, Boolean>> supprimerVehicule(@RequestParam Long idVehicule) {
        return service.supprimerVehicule(idVehicule);
    }


}
