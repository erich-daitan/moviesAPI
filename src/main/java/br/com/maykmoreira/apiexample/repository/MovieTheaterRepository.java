package br.com.maykmoreira.apiexample.repository;

import br.com.maykmoreira.apiexample.model.MovieTheater;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieTheaterRepository extends MongoRepository<MovieTheater, String> {
}

