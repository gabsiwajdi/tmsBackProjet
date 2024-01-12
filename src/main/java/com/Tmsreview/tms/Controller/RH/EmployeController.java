package com.Tmsreview.tms.Controller.RH;


import com.Tmsreview.tms.Models.RH.Employe;
import com.Tmsreview.tms.Services.RH.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeController {

    @Autowired
    EmployeService service;


    @RequestMapping(value = "/employes", method = RequestMethod.GET)
    public List<Employe> tousEmployes() {
        return service.tousEmployes();
    }


    @RequestMapping(value = "/employe", method = RequestMethod.GET)
    public Employe employe(@RequestParam Long idEmployee) {
        return service.employe(idEmployee);
    }




    @PostMapping("/creer_employe")
    public Employe creeEmploye(@RequestBody Employe employe) throws Exception {
        return service.creerEmploye(employe);
    }

    @PutMapping("/modifier-employe")
    public Employe modifierEmploye(@RequestBody Employe employe ) {
        return service.modifieEmploye(employe);
    }

    @DeleteMapping("/supprimer-employe")
    public ResponseEntity<Map<String, Boolean>> supprimerEmploye(@RequestParam Long idEmploye) {
        return service.supprimerEmploye(idEmploye);
    }












}
