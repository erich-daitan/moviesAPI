package br.com.maykmoreira.apiexample.service;

import br.com.maykmoreira.apiexample.model.Movie;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MovieService {
    public List<Movie> getAllMovies();
    public ResponseEntity<Movie> getMovieById(Long id);
    public Movie createMovie(Movie movie);
    public ResponseEntity<Object> deleteMovie(Long id);
}
