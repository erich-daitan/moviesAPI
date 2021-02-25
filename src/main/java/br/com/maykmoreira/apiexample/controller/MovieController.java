package br.com.maykmoreira.apiexample.controller;

import br.com.maykmoreira.apiexample.customException.MovieNotFoundException;
import br.com.maykmoreira.apiexample.model.Movie;

import br.com.maykmoreira.apiexample.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.validation.Valid;

@RestController
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public List<Movie> get(){
        return movieService.getAllMovies();
    }

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
    public ResponseEntity<Movie> getById(@PathVariable(value = "id") long id) {

        try{
            return movieService.getMovieById(id);
        }catch (MovieNotFoundException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(value = "/movie", method =  RequestMethod.POST)
    public Movie post(@Valid @RequestBody Movie movie)
    {
        return movieService.createMovie(movie);
    }

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable(value = "id") long id)
    {
        return movieService.deleteMovie(id);
    }

}
