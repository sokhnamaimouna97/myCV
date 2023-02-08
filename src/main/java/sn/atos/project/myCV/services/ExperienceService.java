package sn.atos.project.myCV.services;

import org.springframework.stereotype.Service;
import sn.atos.project.myCV.entities.Course;
import sn.atos.project.myCV.entities.WorkExperience;
import sn.atos.project.myCV.repositories.WorkExperienceRepository;

import java.util.LinkedList;
import java.util.List;


@Service
public class ExperienceService {
   private final WorkExperienceRepository experienceRepository;

    public ExperienceService(WorkExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public boolean saveExperience(WorkExperience experience) {
        try{
            this.experienceRepository.save(experience);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public List<WorkExperience> getAll() {
        List<WorkExperience> list = new LinkedList<>();
        try{
            list = this.experienceRepository.findAll();
        }catch(Exception e) {}
        return list;
    }


    public boolean deleteCourse(String id) {
        try{
            this.experienceRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
