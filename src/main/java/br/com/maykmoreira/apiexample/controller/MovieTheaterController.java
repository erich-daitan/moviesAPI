package br.com.maykmoreira.apiexample.controller;

import br.com.maykmoreira.apiexample.service.IMovieTheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieTheaterController {

    private IMovieTheaterService movieTheaterService;

    @Autowired
    public MovieTheaterController(IMovieTheaterService movieTheaterService) {
        this.movieTheaterService = movieTheaterService;
    }

//    @RequestMapping(value = "/movieTheater", method = RequestMethod.GET)
//    public List<MovieTheater> get(){
//        return null;
//    }

//    @RequestMapping(value = "/movieTheater", method =  RequestMethod.POST)
//    public MovieTheater post(@Valid @RequestBody MovieTheater movieTheater)
//    {
//        return null;
//    }
}
