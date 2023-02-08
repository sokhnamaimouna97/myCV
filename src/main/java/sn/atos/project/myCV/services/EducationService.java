package sn.atos.project.myCV.services;

import org.springframework.stereotype.Service;
import sn.atos.project.myCV.entities.Certification;
import sn.atos.project.myCV.entities.Education;
import sn.atos.project.myCV.repositories.EducationRepository;

import java.util.LinkedList;
import java.util.List;

@Service
public class EducationService {
    private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public boolean saveEducation(Education education) {
        try{
            this.educationRepository.save(education);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public List<Education> getAll() {
        List<Education> list = new LinkedList<>();
        try{
            list = this.educationRepository.findAll();
        }catch(Exception e) {}
        return list;
    }


    public boolean deleteEducation(String id) {
        try{
            this.educationRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
