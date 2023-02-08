package sn.atos.project.myCV.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document
@ToString
public class Education {


	private String id;

	private List<Graduation> graduations;
	

	private List<Course> courses;
	

	private List<Certification> certification;


}
