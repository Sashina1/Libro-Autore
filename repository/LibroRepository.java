package it.softwareInside.LezioneLibri.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.LezioneLibri.models.Libro;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Integer> {

}
