package sn.atos.project.myCV.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.atos.project.myCV.entities.Certification;
import sn.atos.project.myCV.entities.TechnicalSkill;
import sn.atos.project.myCV.services.GraduationService;
import sn.atos.project.myCV.services.TechnicalSkillService;

import java.util.List;
@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/cv")

public class TechnicalSkillController {
    @Autowired
    private TechnicalSkillService technicalSkillService;
    @GetMapping("/allTechnicalSkill")
    public ResponseEntity<List<TechnicalSkill>> getAll() {
        List<TechnicalSkill> technicalSkills = null;
        try{
            technicalSkills = this.technicalSkillService.getAll();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<TechnicalSkill>>(technicalSkills, HttpStatus.OK);
    }
    @PostMapping("/saveTechnicalSkill")
    public ResponseEntity <TechnicalSkill> addTechnicalSkill(@RequestBody TechnicalSkill skill){
        boolean technicalSkill = false;
        try{
            technicalSkill = this.technicalSkillService.saveSkill(skill);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<TechnicalSkill>(skill, HttpStatus.OK);
    }
}
