package com.example.songr.model;
import javax.persistence.*;
import java.util.List;


@Entity
public class Album {
   private  String title;
   private String artist;
   private  String songCount;
   private String length ;
    private  String imageUrl;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    @OneToMany(mappedBy = "album")
    private List<Song> songs;

    public Album(String title, String artist, String songCount, String length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }
        public Album() {

    }


    public String getTitle() {
        return title;
    }

    public void setTitle( String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongCount() {
        return songCount;
    }

    public void setSongCount(String songCount) {
        this.songCount = songCount;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
