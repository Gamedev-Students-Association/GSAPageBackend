package pl.edu.uj.fais.gsa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Project {

    // make links to media files inside content
    private ProjectType type;
    private String titlePhoto;
    private HashMap<Integer,String> photos;
    private HashMap<Integer,String> gifs;
    private HashMap<Integer,String> videos;
    private String title;
    private String content;
    private Link link;

    private void addPhoto(String photo){
        photos.put(photos.size(),photo);
    }

    private void removePhoto(int index){
        photos.remove(index);
    }

    private void addGif(String gif){
        gifs.put(gifs.size(),gif);
    }

    private void removeGif(int index){
        gifs.remove(index);
    }

    private void addVideo(String video){
        videos.put(videos.size(),video);
    }

    private void removeVideo(int index){
        videos.remove(index);
    }
}
