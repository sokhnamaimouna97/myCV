package sn.atos.project.myCV.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Data
@NoArgsConstructor
@ToString
@Document
public class WorkExperience {

	private String id;

	private String name;

	private String startMonth;

	private String startYear;

	private Boolean currentStatus;

	private String endMonth;

	private String endYear;

	private String company;

	private String description;

	private String projectUrl;

	private String sourceUrl;


}
