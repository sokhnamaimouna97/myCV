package sn.atos.project.myCV.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("course")
@ToString
public class Course {


	private String id;
	
	private String name;
	
	private String instituteName;
	
	private Boolean currentStatus;
	
	private String completionYear;
	
	private String completionMonth;
	

	
	private String url;
	
	private Boolean view = true;
	 

	
}
