package com.Tmsreview.tms.Controller.RH;


import com.Tmsreview.tms.Models.RH.Employe;
import com.Tmsreview.tms.Services.RH.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeController {

    @Autowired
    EmployeService service;


    @RequestMapping(value = "/employes", method = RequestMethod.GET)
    public List<Employe> tousEmployes() {
        return service.tousEmployes();
    }


    @RequestMapping(value = "/employe", method = RequestMethod.GET)
    public Employe employe(@RequestParam Long idEmploye) {
        return service.employe(idEmploye);
    }


    @RequestMapping(value = "/creer-employe", method = RequestMethod.POST)
    public ResponseEntity<?> handleOptions() {
        return ResponseEntity.ok().build();
    }


    //@PostMapping("/creer-employe")
    //public Employe creeEmploye(@RequestBody Employe employe) throws Exception {
      //  return service.creerEmploye(employe);
   // }

    @PutMapping("/modifier-employe")
    public Employe modifierEmploye(@RequestBody Employe employe ) {
        return service.modifieEmploye(employe);
    }

    @DeleteMapping("/supprimer-employe")
    public ResponseEntity<Map<String, Boolean>> supprimerEmploye(@RequestParam Long idEmploye) {
        return service.supprimerEmploye(idEmploye);
    }






}
