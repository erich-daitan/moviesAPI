package br.com.maykmoreira.apiexample.service;

import br.com.maykmoreira.apiexample.customException.MovieNotFoundException;
import br.com.maykmoreira.apiexample.model.Movie;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IMovieService {
    public List<Movie> getAllMovies();
    public ResponseEntity<Movie> getMovieById(Long id) throws MovieNotFoundException;
    public Movie createMovie(Movie movie);
    public ResponseEntity<Object> deleteMovie(Long id);
}
