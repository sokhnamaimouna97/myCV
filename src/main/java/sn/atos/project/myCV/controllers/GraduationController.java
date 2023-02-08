package sn.atos.project.myCV.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.atos.project.myCV.entities.Certification;
import sn.atos.project.myCV.entities.Graduation;
import sn.atos.project.myCV.services.CourseService;
import sn.atos.project.myCV.services.GraduationService;

import java.util.List;
@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/cv")

public class GraduationController {
    @Autowired
    private GraduationService graduationService;
    @GetMapping("/allGraduation")
    public ResponseEntity<List<Graduation>> getAll() {
        List<Graduation> graduations = null;
        try{
            graduations = this.graduationService.getAll();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<Graduation>>(graduations, HttpStatus.OK);
    }
    @PostMapping("/saveGraduation")
    public ResponseEntity <Graduation> addGraduation(@RequestBody Graduation graduation){
        boolean certificate = false;
        try{
            certificate = this.graduationService.saveGraduation(graduation);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<Graduation>(graduation, HttpStatus.OK);
    }
}
