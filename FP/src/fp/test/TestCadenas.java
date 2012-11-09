package fp.test;

import fp.util.Cadenas;

public class TestCadenas extends Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Probando cuenta vocales
		mostrar(Cadenas.cuentaVocales("Rocio es una nina"));
		mostrar(Cadenas.cuentaVocales("--- hola -.-, 24345 mundo 0cruelll"));
		
		//Probando invertir cadena
		mostrar(Cadenas.invierteCadena("Palabra a invertir por el metodo"));
		
		//Probando palindroma
		mostrar(Cadenas.esPalindroma("HooooH"));
		mostrar(Cadenas.esPalindroma("gabriel"));
		
		//Probando cuenta aparariciones
		mostrar(Cadenas.cuentaApariciones("juana de arcos esta sola", 'a'));
		
	}
	
}
