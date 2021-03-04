package br.com.maykmoreira.apiexample.model;

/**
 * Movie is the main entity we'll be using to . . .
 *
 * @author Mayk Moreira
 */

import org.springframework.data.annotation.Id;

public class Movie {
    @Id
    private String id;

    private String title;

    private String genre;

    public Movie() {
    }

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    /**
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
