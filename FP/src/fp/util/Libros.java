package fp.util;

import java.util.List;
import fp.libro.Libro;

public class Libros {
	//a)
	public static Integer cuantaLibrosConMasPaginas(List<Libro> libros, Integer nPag){
		Integer result = 0;
		for(Libro lib: libros){
			if(lib.getNumPag() >= nPag){
				result ++;
			}
		}
		return result;
	}
	//b)
	public static Double calcularPrecioCompra(List<Libro> l){
		Double result = 0.0;
		for(Libro lib : l){
			result += lib.getPrecio();
		}
		
		return result;
	}
	//c)
	public static Libro buscarLibroIsbn(List<Libro> l, String isbn){
		Libro result = null;
		for(Libro lib : l){
			if(lib.getIsbn().equals(isbn)){
				result = lib;
				break;
			}
		}
		return result;
	}
	//d)
	public static Libro buscaLibroPorAutor(Libro[] l, String apellidos){
		Libro result = null;
		
		for(int i=0 ; i < l.length ;i++ ){
			if(apellidos.contains(l[i].getAutor().getApellidos())){
				result = l[i];
				break;
			}
		}
		return result;
	}

}
