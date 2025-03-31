package pl.edu.uj.fais.gsa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class GSAEvent {

    private String titlePhoto;
    private HashMap<Integer,String> photos;
    private String title;
    private String content;


    private void addPhoto(String photo){
        photos.put(photos.size(),photo);
    }

    private void removePhoto(int index){
        photos.remove(index);
    }


}
