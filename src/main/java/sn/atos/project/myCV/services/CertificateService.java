package sn.atos.project.myCV.services;

import org.springframework.stereotype.Service;
import sn.atos.project.myCV.entities.Certification;
import sn.atos.project.myCV.repositories.CertificationRepository;

import java.util.LinkedList;
import java.util.List;

@Service
public class CertificateService {
	private  final CertificationRepository certificationRepository;

	public CertificateService(CertificationRepository certificationRepository) {
		this.certificationRepository = certificationRepository;
	}

	public boolean saveCertificate(Certification certification) {
		try{
			this.certificationRepository.save(certification);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	public List<Certification> getAll() {
		List<Certification> list = new LinkedList<>();
		try{
			list = this.certificationRepository.findAll();
		}catch(Exception e) {}
		return list;
	}


	public boolean deleteCertification(String id) {
		try{
			this.certificationRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}

	
	

