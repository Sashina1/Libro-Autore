package it.softwareInside.LezioneLibri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.LezioneLibri.models.Libro;
import it.softwareInside.LezioneLibri.repository.LibroRepository;
import jakarta.validation.Valid;




@Service
public class LibroService {

	@Autowired
	LibroRepository lr;
	

	
	public boolean addL(Libro libro) {
		
		try {
			lr.save(libro);
			
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
 
	public Iterable<Libro> printAll() {
		
		return lr.findAll();
		
	}
	
	
	
	
	public Libro findL(@Valid int id) {
		
		try {
			return lr.findById(id).get();
		} catch (Exception e) {
			return null;
		}
	}
	
	
	
	
	/**
	 * cancella libro per id
	 * da input
	 * @param codiceF
	 */
	public Libro deleteL( int id) {
		
		try {
			Libro libro = lr.findById(id).get();
			 lr.deleteById(id);
			 return libro;
		} catch (Exception e) {
			return null;
		}
		
		 
	}
	
	
	
	
	/**
	 * cancella tutto database.
	 */
	public void deleteAllL() {
		
		 lr.deleteAll();
	}
	
	
		
	public boolean update(Libro libro) {
			
			return addL(libro);
		}
	
	
}
