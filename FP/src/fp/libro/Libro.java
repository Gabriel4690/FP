package fp.libro;

import fp.persona.Persona;

/*7. Especifique el tipo Libro, con las propiedades:
    o ISBN, de tipo cadena, consultable.
    o titulo, de tipo cadena, consultable y modificable;
    o autor, de tipo Persona, consultable y modificable;
    o número de Páginas, de tipo entero, consultable y modificable;
    o precio, de tipo real, consultable y modificable;
    o best-seller, de tipo booleano, consultable y modificable
*/
public interface Libro {
	
	//consultables
	String getIsbn();
	Persona getAutor();
	String getTitulo();
	Integer getNumPag();
	Double getPrecio();
	boolean getBestSeller();
	
	//Modificables
	void setAutor(Persona autor);
	void setTitulo(String titulo);
	void setNumPag(Integer numPag);
	void setPrecio(Double precio);
	void setBestSeller(boolean bestSeller);
}
