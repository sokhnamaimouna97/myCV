package sn.atos.project.myCV.repositories;

import org.springframework.stereotype.Repository;
import sn.atos.project.myCV.entities.Course;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface CourseRepository extends MongoRepository<Course,String>{
}
