package pl.edu.uj.fais.gsa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class GSAEvent {

    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private OwnershipType ownershipType;
    @Enumerated(EnumType.STRING)
    private ImportanceType importanceType;

    private String titlePhoto;

    @ManyToOne
    @JoinColumn(name = "shader_id", foreignKey = @ForeignKey(name = "FK_news_shader"))
    private Shader shader;


    @ElementCollection
    @CollectionTable(name = "news_photos", joinColumns = @JoinColumn(name = "news_id"))
    @MapKeyColumn(name = "photo_id")
    @Column(name = "photo")
    private HashMap<Integer,String> photos;

    @ElementCollection
    @CollectionTable(name = "news_videos", joinColumns = @JoinColumn(name = "news_id"))
    @MapKeyColumn(name = "video_id")
    @Column(name = "video")
    private HashMap<Integer,String> videos;


    @ElementCollection
    @CollectionTable(name = "news_gifs", joinColumns = @JoinColumn(name = "news_id"))
    @MapKeyColumn(name = "gif_id")
    @Column(name = "gif")
    private HashMap<Integer,String> gifs;



    private String title;
    private String content;

    @Enumerated(EnumType.STRING)
    private EventFrequencyType eventFrequencyType;
    private int interval;

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String location;

    private void addPhoto(String photo){
        photos.put(photos.size(),photo);
    }

    private void removePhoto(int index){
        photos.remove(index);
    }

    @PreUpdate
    public void onUpdate(){
        this.updatedAt = LocalDateTime.now();
    }

    @PrePersist
    public void onCreate(){
        this.createdAt = LocalDateTime.now();
    }


}
