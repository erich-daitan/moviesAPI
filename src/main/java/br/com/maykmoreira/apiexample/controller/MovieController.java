package br.com.maykmoreira.apiexample.controller;

import br.com.maykmoreira.apiexample.customException.MovieException;
import br.com.maykmoreira.apiexample.model.Movie;

import br.com.maykmoreira.apiexample.service.IMovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.validation.Valid;

@RestController
public class MovieController {

    Logger logger = LoggerFactory.getLogger(MovieController.class);
    private IMovieService IMovieService;

    @Autowired
    public MovieController(IMovieService IMovieService) {
        this.IMovieService = IMovieService;
    }

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public List<Movie> get() {
        return IMovieService.getAllMovies();
    }

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
    public ResponseEntity<Movie> getById(@PathVariable(value = "id") String id) {
        try {
            return IMovieService.getMovieById(id);
        } catch (MovieException e) {
            logger.error(String.valueOf(e));
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/movie", method = RequestMethod.POST)
    public Movie post(@Valid @RequestBody Movie movie) {
        return IMovieService.createMovie(movie);
    }

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable(value = "id") String id) {
        return IMovieService.deleteMovie(id);
    }

}
