package sn.atos.project.myCV.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sn.atos.project.myCV.entities.Education;

@Repository
public interface EducationRepository extends MongoRepository<Education,String> {
}
