package pl.edu.uj.fais.gsa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Section {

    private String logo;
    private String name;
    private Member leader;
    private Date startDate;
    private Date endDate;
    private String description;
    private List<Project> project;


}
