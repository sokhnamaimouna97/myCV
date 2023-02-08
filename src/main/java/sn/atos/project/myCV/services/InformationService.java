package sn.atos.project.myCV.services;

import org.springframework.stereotype.Service;
import sn.atos.project.myCV.entities.Course;
import sn.atos.project.myCV.entities.Information;
import sn.atos.project.myCV.repositories.InformationRepository;

import java.util.LinkedList;
import java.util.List;


@Service
public class InformationService {
    private final InformationRepository  informationRepository;

    public InformationService(InformationRepository informationRepository) {
        this.informationRepository = informationRepository;
    }


    public boolean saveInformation(Information information) {
        try{
            this.informationRepository.save(information);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public List<Information> getAll() {
        List<Information> list = new LinkedList<>();
        try{
            list = this.informationRepository.findAll();
        }catch(Exception e) {}
        return list;
    }


    public boolean deleteInformation(String id) {
        try{
            this.informationRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
