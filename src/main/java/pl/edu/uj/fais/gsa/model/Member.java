package pl.edu.uj.fais.gsa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Member {

    private String photo;
    private String name;
    private String secondName;
    private String surname;
    private String position;
    private String email;
    private String about;

    public Member(String name, String surname){
        this.name = name;
        this.surname = surname;
    }


}
