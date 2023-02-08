package sn.atos.project.myCV.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import sn.atos.project.myCV.entities.Course;
import sn.atos.project.myCV.entities.PersonalInformation;
import sn.atos.project.myCV.repositories.PersonalInfoRepository;

@Service
public class PersonalInformationService {
	private final PersonalInfoRepository infoRepository;

	public PersonalInformationService(PersonalInfoRepository infoRepository) {
		this.infoRepository = infoRepository;
	}

	public boolean savePersonalInfo(PersonalInformation personalInformation) {
		try{
			this.infoRepository.save(personalInformation);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	public List<PersonalInformation> getAll() {
		List<PersonalInformation> list = new LinkedList<>();
		try{
			list = this.infoRepository.findAll();
		}catch(Exception e) {}
		return list;
	}


	public boolean deletePersonalInfo(String id) {
		try{
			this.infoRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	
}
