package sn.atos.project.myCV.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import sn.atos.project.myCV.entities.Course;
import sn.atos.project.myCV.repositories.CourseRepository;

@Service
public class CourseService {
	private final CourseRepository courseRepository;

	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public boolean saveCourse(Course course) {
		try{
			this.courseRepository.save(course);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	public List<Course> getAll() {
		List<Course> list = new LinkedList<>();
		try{
			list = this.courseRepository.findAll();
		}catch(Exception e) {}
		return list;
	}


	public boolean deleteCourse(String id) {
		try{
			this.courseRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}



