package sn.atos.project.myCV.services;

import org.springframework.stereotype.Service;
import sn.atos.project.myCV.entities.Course;
import sn.atos.project.myCV.entities.SocialInformation;
import sn.atos.project.myCV.repositories.SocialInfoRepository;

import java.util.LinkedList;
import java.util.List;

@Service
public class SocialInfoService {
    private final SocialInfoRepository infoRepository;

    public SocialInfoService(SocialInfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }


    public boolean saveSocialInfo(SocialInformation information) {
        try{
            this.infoRepository.save(information);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public List<SocialInformation> getAll() {
        List<SocialInformation> list = new LinkedList<>();
        try{
            list = this.infoRepository.findAll();
        }catch(Exception e) {}
        return list;
    }


    public boolean deleteSocialInfo(String id) {
        try{
            this.infoRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
