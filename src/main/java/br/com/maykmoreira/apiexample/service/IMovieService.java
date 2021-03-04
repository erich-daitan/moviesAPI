package br.com.maykmoreira.apiexample.service;

import br.com.maykmoreira.apiexample.customException.MovieException;
import br.com.maykmoreira.apiexample.model.Movie;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IMovieService {
    public List<Movie> getAllMovies();

    public ResponseEntity<Movie> getMovieById(String id) throws MovieException;

    public Movie createMovie(Movie movie);

    public ResponseEntity<Object> deleteMovie(String id);
}
