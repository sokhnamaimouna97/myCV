package sn.atos.project.myCV.entities;



import lombok.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class Graduation {


	private String id;
	
	private String type;
	
	private String universityName;
	
	private String country;
	
	private String state;
	
	private String city;
	
	private String degree;
	

	private String grade;
	
	private Boolean currentStatus;
	
	private String completionYear;
	
	private String completionMonth;



}
