package sn.atos.project.myCV.controllers;


import sn.atos.project.myCV.entities.PersonalInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.atos.project.myCV.services.PersonalInformationService;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/cv")
public class PersonnalInformationController {
    @Autowired
    private PersonalInformationService informationService;


    @GetMapping("/getAllInforPersonal")
    public ResponseEntity<List<PersonalInformation>> getAll() {
        return new ResponseEntity<List<PersonalInformation>>(this.informationService.getAll(), HttpStatus.OK);
    }


    @PostMapping("/saveInfoPersonal")
    public ResponseEntity <PersonalInformation> addPersonalFormation(@RequestBody PersonalInformation personalInformation){
        boolean information = false;
        try{
            information = this.informationService.savePersonalInfo(personalInformation);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<PersonalInformation>(personalInformation, HttpStatus.OK);
    }
}
