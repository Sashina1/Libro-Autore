package it.softwareInside.LezioneLibri.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.LezioneLibri.models.Autore;

@Repository
public interface AutoreRepository extends CrudRepository<Autore, Integer>{

}
