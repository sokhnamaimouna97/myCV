package sn.atos.project.myCV.repositories;

import org.springframework.stereotype.Repository;
import sn.atos.project.myCV.entities.Certification;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface CertificationRepository extends MongoRepository<Certification,String> {
}
