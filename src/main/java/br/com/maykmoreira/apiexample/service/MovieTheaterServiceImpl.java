package br.com.maykmoreira.apiexample.service;

import br.com.maykmoreira.apiexample.model.Movie;
import br.com.maykmoreira.apiexample.model.MovieTheater;
import br.com.maykmoreira.apiexample.repository.MovieRepository;
import br.com.maykmoreira.apiexample.repository.MovieTheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieTheaterServiceImpl implements MovieTheaterService{

    private MovieTheaterRepository movieTheaterRepository;

    @Autowired
    public MovieTheaterServiceImpl(MovieTheaterRepository _movieRepository) {
        this.movieTheaterRepository = _movieRepository;
    }

    @Override
    public List<MovieTheater> getAllMovieTheaters(){
        return movieTheaterRepository.findAll();
    }

    @Override
    public ResponseEntity<MovieTheater> getMovieTheaterById(Long id){
        Optional<MovieTheater> movieTheater = movieTheaterRepository.findById(id);

        if(movieTheater.isPresent())
            return new ResponseEntity<MovieTheater>(movieTheater.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public MovieTheater createMovieTheater(MovieTheater movieTheater){
        return movieTheaterRepository.save(movieTheater);
    }

    @Override
    public ResponseEntity<Object> deleteMovieTheater(Long id){
        Optional<MovieTheater> movieTheater = movieTheaterRepository.findById(id);
        if(movieTheater.isPresent()){
            movieTheaterRepository.delete(movieTheater.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
