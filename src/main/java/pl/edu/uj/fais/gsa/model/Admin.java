package pl.edu.uj.fais.gsa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToOne
    @JoinColumn(name = "member_id", foreignKey = @ForeignKey(name = "FK_admin_member"))
    private Member member;

    private String login;
    private String password;
    private PermissionType permissionType;

    private LocalDateTime hasAdminSince;
    private LocalDateTime hasAdminUntil;

    @PreUpdate
    public void onUpdate(){
        this.updatedAt = LocalDateTime.now();
    }


    @PrePersist
    public void onCreate(){
        this.createdAt = LocalDateTime.now();
    }


}
