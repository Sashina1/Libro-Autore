package it.softwareInside.LezioneLibri.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Min;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

 
@Entity
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Min(value = 50)
	private int pagine;
	
	private String titolo;
	
	@OneToOne( cascade = CascadeType.ALL )
	@JoinColumn(name = " autoreId")
	private Autore autore;
	
	
	public Libro(int pagine,String titolo, Autore autore) {
		setPagine(pagine);
		setTitolo(titolo);
		setAutore(autore);
		
	}
	
	
	
	
	
	
	
}
