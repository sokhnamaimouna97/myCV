package sn.atos.project.myCV.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Blob;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("certification")
@ToString
public class Certification {


	private String id;
	
	private String title;
	
	private String instituteName;
	
	private String year;
	
	private String month;
	

	private String url;

	private Boolean view = true;
	 

	
	
}
