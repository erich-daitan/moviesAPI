package br.com.maykmoreira.apiexample.model;

import javax.persistence.*;
/**
 * Movie is the main entity we'll be using to . . .
 *
 * @author Mayk Moreira
 *
 */
@Entity
public class Movie {
    @Id
    @SequenceGenerator(name = "movie_sequence",sequenceName = "movie_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_sequence")
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String genre;

    public Movie() {
    }

    public Movie(long id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title You can consider it as the name of the movie
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
