package sn.atos.project.myCV.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class Information {

	private String id;


	private PersonalInformation personalInformation;
	
	private SocialInformation socialInformation;


	
}
