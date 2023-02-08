package sn.atos.project.myCV.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.atos.project.myCV.entities.Certification;
import sn.atos.project.myCV.entities.Information;
import sn.atos.project.myCV.services.GraduationService;
import sn.atos.project.myCV.services.InformationService;

import java.util.List;
@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/cv")

public class InformationController {
    @Autowired
    private InformationService informationService;

    @GetMapping("/allInfo")
    public ResponseEntity<List<Information>> getAll() {
        List<Information> informations = null;
        try{
            informations = this.informationService.getAll();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<Information>>(informations, HttpStatus.OK);
    }
    @PostMapping("/saveInfo")
    public ResponseEntity <Information> addInformation(@RequestBody Information information){
        boolean certificate = false;
        try{
            certificate = this.informationService.saveInformation(information);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<Information>(information, HttpStatus.OK);
    }
}
