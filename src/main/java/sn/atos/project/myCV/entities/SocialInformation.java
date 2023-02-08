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
public class SocialInformation {


	private String id;
	
	private String facebookUrl;

	private String googleUrl;
	
	private String instagramUrl;
	
	private String linkedinUrl;
	
	private String githubUrl;


}
