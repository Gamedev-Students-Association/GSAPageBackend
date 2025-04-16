package pl.edu.uj.fais.gsa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter

@Entity
@Table(name = "section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String logo;
    private String name;

    @OneToOne
    private Member leader;

    private Date startDate;
    private Date endDate;
    private String location;
    private LocalDateTime meetingTime;
    private Time meetingDuration;
    private EventFrequencyType meetingFrequency;

    private String description;

    @OneToMany
    @JoinColumn(name = "section_id", foreignKey = @ForeignKey(name = "FK_section_project"))
    private List<Project> project;


}
