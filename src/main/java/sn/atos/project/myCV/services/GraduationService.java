package sn.atos.project.myCV.services;

import org.springframework.stereotype.Service;
import sn.atos.project.myCV.entities.Course;
import sn.atos.project.myCV.entities.Graduation;
import sn.atos.project.myCV.repositories.GraduationRepository;

import java.util.LinkedList;
import java.util.List;


@Service
public class GraduationService {
    private final GraduationRepository graduationRepository;

    public GraduationService(GraduationRepository graduationRepository) {
        this.graduationRepository = graduationRepository;
    }


    public boolean saveGraduation(Graduation graduation) {
        try{
            this.graduationRepository.save(graduation);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public List<Graduation> getAll() {
        List<Graduation> list = new LinkedList<>();
        try{
            list = this.graduationRepository.findAll();
        }catch(Exception e) {}
        return list;
    }


    public boolean deleteGraduation(String id) {
        try{
            this.graduationRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
