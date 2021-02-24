package br.com.maykmoreira.apiexample.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.maykmoreira.apiexample.model.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
}
