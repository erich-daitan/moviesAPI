package br.com.maykmoreira.apiexample.service;

import br.com.maykmoreira.apiexample.model.Movie;
import br.com.maykmoreira.apiexample.model.MovieTheater;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MovieTheaterService {
    public List<MovieTheater> getAllMovieTheaters();
    public ResponseEntity<MovieTheater> getMovieTheaterById(Long id);
    public MovieTheater createMovieTheater(MovieTheater movieTheater);
    public ResponseEntity<Object> deleteMovieTheater(Long id);
}
