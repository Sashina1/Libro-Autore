package it.softwareInside.LezioneLibri.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.LezioneLibri.models.Libro;
import it.softwareInside.LezioneLibri.service.LibroService;

@RequestMapping("/api")
@RestController
public class LibroController {

	@Autowired
	LibroService ls;
	
	
	
	
	
	@PostMapping("/addL")
	public boolean addL(@RequestBody Libro libro) {
		
		return ls.addL(libro);
	
	}
	
	
	
	@GetMapping("/printAll")
	public Iterable<Libro> printAll(){
		
		return ls.printAll();
		
	}
	
	
	
	@PostMapping("/findl")
	public Libro findP(@RequestParam("id") int id) {
		
		return ls.findL(id);
	}
	
	
	
	
	
	
	@DeleteMapping("/deleteL")
	public boolean deletel(@RequestParam("id") int id) {
		
		ls.deleteL(id);
		return true;
	}
	
	
	
	
	@DeleteMapping("/deleteAll")
	public void deleteAll() {
		 
		ls.deleteAllL();
		
	}
	
	
	
	
	@PostMapping("/update")
	public boolean update(@RequestBody Libro libro) {
		
		return ls.addL(libro);
	}
	
}
