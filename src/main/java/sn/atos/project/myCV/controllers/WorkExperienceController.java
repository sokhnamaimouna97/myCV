package sn.atos.project.myCV.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.atos.project.myCV.entities.Certification;
import sn.atos.project.myCV.entities.WorkExperience;
import sn.atos.project.myCV.services.ExperienceService;
import sn.atos.project.myCV.services.GraduationService;

import java.util.List;
@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/cv")

public class WorkExperienceController {
    @Autowired
    private ExperienceService experienceService;
    @GetMapping("/allExperience")
    public ResponseEntity<List<WorkExperience>> getAll() {
        List<WorkExperience> experiences = null;
        try{
            experiences = this.experienceService.getAll();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<WorkExperience>>(experiences, HttpStatus.OK);
    }
    @PostMapping("/saveExperience")
    public ResponseEntity <WorkExperience> addExperience(@RequestBody WorkExperience workExperience){
        boolean experience = false;
        try{
            experience = this.experienceService.saveExperience(workExperience);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<WorkExperience>(workExperience, HttpStatus.OK);
    }
}
