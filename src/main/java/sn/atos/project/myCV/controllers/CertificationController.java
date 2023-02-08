package sn.atos.project.myCV.controllers;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import sn.atos.project.myCV.entities.Certification;
import sn.atos.project.myCV.services.CertificateService;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/cv")
public class CertificationController {
    @Autowired
    private CertificateService certificateService;

    @GetMapping("/allCertification")
    public ResponseEntity<List<Certification>> getAll() {
       List<Certification> certifications = null;
        try{
            certifications = this.certificateService.getAll();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<Certification>>(certifications, HttpStatus.OK);
    }
    @PostMapping("/saveCertification")
    public ResponseEntity <Certification> addFormation(@RequestBody Certification certification){
        boolean certificate = false;
        try{
            certificate = this.certificateService.saveCertificate(certification);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<Certification>(certification, HttpStatus.OK);
    }
}
