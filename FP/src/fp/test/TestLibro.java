package fp.test;

import java.util.ArrayList;
import java.util.List;

import fp.libro.Libro;
import fp.libro.LibroImpl;
import fp.persona.PersonaImpl;
import fp.util.Libros;

public class TestLibro extends Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Libro l2 = new LibroImpl("9788437605227","El arbol de la Ciencia",new PersonaImpl("Pio","Baroja","28121872S"),304,23.60,false);
		Libro l3 = new LibroImpl("9788437605227","El arbol de la Ciencia",new PersonaImpl("Pio","Baroja","28121872S"),304,10.60,false);
		Libro l = new LibroImpl("9788437605227","El arbol de la Ciencia",new PersonaImpl("Pio","Baroja","28121872S"),304,8.60,false);
				mostrar("Libro: ",l);
				mostrar("Nombre del autor: ", l.getAutor().getNombre());
				// Cambiamos el precio del libro
				l.setPrecio(10.0);
				// Restarle 5 pÃ¡ginas al nÃºmero total de pÃ¡ginas
				l.setNumPag(l.getNumPag() - 5);
				// Cambiar el dni del autor
				//l.getAutor().setDNI("30101956M"); //No es un atributo modificable de la clase PersonaImpl
				mostrar("El libro con los cambios: ", l);

		//Probando calcular precio de la compra
		List<Libro> listaLibros = new ArrayList<Libro>();
		listaLibros.add(l);
		listaLibros.add(l2);
		listaLibros.add(l3);
		
		Double precioCompra = 0.0;		
		mostrar(precioCompra = Libros.calcularPrecioCompra(listaLibros));
		
	}

}
