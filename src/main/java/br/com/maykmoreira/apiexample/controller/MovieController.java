package br.com.maykmoreira.apiexample.controller;

import br.com.maykmoreira.apiexample.customException.MovieNotFoundException;
import br.com.maykmoreira.apiexample.model.Movie;

import br.com.maykmoreira.apiexample.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.validation.Valid;

@RestController
public class MovieController {

    private IMovieService IMovieService;

    @Autowired
    public MovieController(IMovieService IMovieService) {
        this.IMovieService = IMovieService;
    }

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public List<Movie> get(){
        return IMovieService.getAllMovies();
    }

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
    public ResponseEntity<Movie> getById(@PathVariable(value = "id") long id) {

        try{
            return IMovieService.getMovieById(id);
        }catch (MovieNotFoundException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(value = "/movie", method =  RequestMethod.POST)
    public Movie post(@Valid @RequestBody Movie movie)
    {
        return IMovieService.createMovie(movie);
    }

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable(value = "id") long id)
    {
        return IMovieService.deleteMovie(id);
    }

}
