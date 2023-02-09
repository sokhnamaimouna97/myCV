package sn.atos.project.myCV.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document("technicalSkills")
@ToString
public class TechnicalSkill {

	private String id;
	
	private String name;
	private String level;

	private Boolean view = true;
	 

}
