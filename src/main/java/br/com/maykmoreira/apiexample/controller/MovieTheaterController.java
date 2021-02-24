package br.com.maykmoreira.apiexample.controller;

import br.com.maykmoreira.apiexample.service.MovieTheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
public class MovieTheaterController {

    private MovieTheaterService movieTheaterService;

    @Autowired
    public MovieTheaterController(MovieTheaterService movieTheaterService) {
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
