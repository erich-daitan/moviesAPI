package br.com.maykmoreira.apiexample.repository;

import br.com.maykmoreira.apiexample.model.Movie;
import br.com.maykmoreira.apiexample.model.MovieTheater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieTheaterRepository extends JpaRepository<MovieTheater, Long> {
}

