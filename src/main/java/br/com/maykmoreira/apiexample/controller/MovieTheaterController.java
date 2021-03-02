package br.com.maykmoreira.apiexample.controller;

import br.com.maykmoreira.apiexample.model.MovieTheater;
import br.com.maykmoreira.apiexample.service.IMovieTheaterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MovieTheaterController {

    Logger logger = LoggerFactory.getLogger(MovieTheaterController.class);

    private IMovieTheaterService movieTheaterService;

    @Autowired
    public MovieTheaterController(IMovieTheaterService movieTheaterService) {
        this.movieTheaterService = movieTheaterService;
    }

    @RequestMapping(value = "/movieTheater", method = RequestMethod.GET)
    public List<MovieTheater> get() {
        return this.movieTheaterService.getAllMovieTheaters();
    }

    @RequestMapping(value = "/movieTheater", method = RequestMethod.POST)
    public MovieTheater post(@Valid @RequestBody MovieTheater movieTheater) {
        return this.movieTheaterService.createMovieTheater(movieTheater);
    }
}
