package sn.atos.project.myCV.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.atos.project.myCV.entities.Certification;
import sn.atos.project.myCV.entities.SocialInformation;
import sn.atos.project.myCV.services.GraduationService;
import sn.atos.project.myCV.services.SocialInfoService;

import java.util.List;
@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/cv")

public class SocialInfoController {
    @Autowired
    private SocialInfoService socialInfoService;
    @GetMapping("/allSocialInfo")
    public ResponseEntity<List<SocialInformation>> getAll() {
        List<SocialInformation> socialInformations = null;
        try{
            socialInformations = this.socialInfoService.getAll();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<SocialInformation>>(socialInformations, HttpStatus.OK);
    }
    @PostMapping("/saveSocialInfo")
    public ResponseEntity <SocialInformation> addSocialInFormation(@RequestBody SocialInformation information){
        boolean info = false;
        try{
            info = this.socialInfoService.saveSocialInfo(information);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<SocialInformation>(information, HttpStatus.OK);
    }
}
