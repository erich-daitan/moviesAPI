package br.com.maykmoreira.apiexample.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import br.com.maykmoreira.apiexample.model.Movie;


@Repository
public interface MovieRepository extends MongoRepository<Movie, String>{
}
