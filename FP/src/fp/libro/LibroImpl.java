package fp.libro;

import fp.excepciones.LibroNoValidoException;
import fp.persona.Persona;
import fp.persona.PersonaImpl;

public class LibroImpl implements Libro {
	
	private Persona autor;
	private String isbn, titulo;
	private Integer numPag;
	private Double precio;
	private boolean bestSeller;
	
	
	public LibroImpl(){
		//En el constructor por defecto utilizamos el constructor por defecto de la clase persona
		this.autor = new PersonaImpl();
		this.isbn = "";
		this.titulo = "";
		this.numPag = 0;
		this.precio = 0.0;
		this.bestSeller = false;
	}
	public LibroImpl(String isbn, String titulo, Persona autor, Integer numPag, Double precio, boolean bestSeller){
		if((numPag < 0)){
			throw new LibroNoValidoException("Numero de Paginas invalido");
		}
		if((precio >= 0)){
			throw new LibroNoValidoException("Numero de Precio no válido");
		}
		if((isbn.length() != 0 && isbn.length() != 10 && isbn.length() != 13)){
			throw new LibroNoValidoException("Fallo en el ISBN");
		}
		
		this.autor = autor;
		this.isbn = isbn;
		this.titulo = titulo;
		this.numPag = numPag;
		this.precio = precio;
		this.bestSeller = bestSeller;
	}
	
	@Override
	public String getIsbn() {
		return this.isbn;
	}

	@Override
	public Persona getAutor() {
		return this.autor;
	}

	@Override
	public String getTitulo() {
		return this.titulo;
	}

	@Override
	public Integer getNumPag() {
		return this.numPag;
	}

	@Override
	public Double getPrecio() {
		return this.precio;
	}

	@Override
	public boolean getBestSeller() {
		return this.bestSeller;
	}

	@Override
	public void setAutor(Persona autor) {
		this.autor = autor;
		
	}

	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
		
	}

	@Override
	public void setNumPag(Integer numPag) {
		if((numPag < 0)){
			throw new LibroNoValidoException("Numero de Paginas invalido");
		}
		this.numPag = numPag;
		
	}

	@Override
	public void setPrecio(Double precio) {
		if((precio >= 0)){
			throw new LibroNoValidoException("Numero de Precio no válido");
		}
		this.precio = precio;
		
	}

	@Override
	public void setBestSeller(boolean bestSeller) {
		this.bestSeller = bestSeller;
		
	}
	
	public String toString(){
		
		return getIsbn() + " - " + this.getTitulo() + " - " + getAutor() + " - " + this.getNumPag() + " - " + this.getPrecio() + " - " + this.getBestSeller();
	}

}
