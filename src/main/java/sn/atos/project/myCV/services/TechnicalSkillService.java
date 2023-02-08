package sn.atos.project.myCV.services;

import org.springframework.stereotype.Service;
import sn.atos.project.myCV.entities.Course;
import sn.atos.project.myCV.entities.TechnicalSkill;
import sn.atos.project.myCV.repositories.TechnicalSkillRepository;

import java.util.LinkedList;
import java.util.List;


@Service
public class TechnicalSkillService {
    private final TechnicalSkillRepository technicalSkillRepository;

    public TechnicalSkillService(TechnicalSkillRepository technicalSkillRepository) {
        this.technicalSkillRepository = technicalSkillRepository;
    }


    public boolean saveSkill(TechnicalSkill skill) {
        try{
            this.technicalSkillRepository.save(skill);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public List<TechnicalSkill> getAll() {
        List<TechnicalSkill> list = new LinkedList<>();
        try{
            list = this.technicalSkillRepository.findAll();
        }catch(Exception e) {}
        return list;
    }


    public boolean deleteTechnicalSkill(String id) {
        try{
            this.technicalSkillRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
