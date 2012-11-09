package fp.test;

import java.util.ArrayList;

import fp.util.Enteros;

public class TestEnteros extends Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer a = 48;
		Integer b = 900;
		
		mostrar(Enteros.maximo(a,b));
		mostrar("");
		Integer c = 2000;
		
		mostrar(Enteros.maximo(a,b,c));
		mostrar("");
		mostrar(Enteros.factorial(10));
		mostrar("");
		//cremos la lista
		ArrayList<Integer> lista = new ArrayList<Integer>();
		//llenamos la lista con valores del 0 al 99
		for(int i = 0; i<100; i++){
			lista.add(i);
		}
		mostrar("primos menores  ", Enteros.primosMenores(a));
		mostrar("");
		mostrar("suma ", Enteros.sumaElementos(lista));
		mostrar("");
		mostrar("media ", Enteros.mediaAritmetica(lista));
		mostrar("");
		mostrar("lista de inversos  ", Enteros.listaInversa(lista));
	}

}
