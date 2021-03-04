package br.com.maykmoreira.apiexample.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class MovieTheater {

    @Id
    private String id;

    private String name;

    private int rooms;

    private List<Movie> playing;

    public MovieTheater() {
        this.playing = new ArrayList<Movie>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public List<Movie> getPlaying() {
        return playing;
    }

    public void setPlaying(List<Movie> playing) {
        this.playing = playing;
    }

    @Override
    public String toString() {
        return "MovieTheater{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rooms=" + rooms +
                ", playing=" + playing +
                '}';
    }
}
