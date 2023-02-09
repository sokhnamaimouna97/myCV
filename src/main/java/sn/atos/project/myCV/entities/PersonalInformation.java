package sn.atos.project.myCV.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@Data
@NoArgsConstructor
@ToString
@Document
public class PersonalInformation {
    private String id;
    private String tel;
    private String email;
    private String nom;
    private String prenom;

    private String country;
    private String city;

    private String picture;

    private String summary;
    private String title;

    private String civility;
}
