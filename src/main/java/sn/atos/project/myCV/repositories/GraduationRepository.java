package sn.atos.project.myCV.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sn.atos.project.myCV.entities.Graduation;

@Repository
public interface GraduationRepository extends MongoRepository<Graduation,String> {
}
