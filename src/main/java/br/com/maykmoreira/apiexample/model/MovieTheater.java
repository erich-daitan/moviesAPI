package br.com.maykmoreira.apiexample.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class MovieTheater {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int rooms;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Movie> playing;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
