package br.com.maykmoreira.apiexample.service;

import br.com.maykmoreira.apiexample.customException.MovieNotFoundException;
import br.com.maykmoreira.apiexample.model.Movie;
import br.com.maykmoreira.apiexample.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService implements IMovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    @Override
    public ResponseEntity<Movie> getMovieById(Long id) throws MovieNotFoundException {
        Optional<Movie> movie = movieRepository.findById(id);

        if(movie.isPresent())
            return new ResponseEntity<Movie>(movie.get(), HttpStatus.OK);
        else
            throw new MovieNotFoundException("Could not find movie with ID " + id);

    }

    @Override
    public Movie createMovie(Movie movie){
        return movieRepository.save(movie);
    }

    @Override
    public ResponseEntity<Object> deleteMovie(Long id){
        Optional<Movie> movie = movieRepository.findById(id);
        if(movie.isPresent()){
            movieRepository.delete(movie.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
