package fp.util;

public class Cadenas {
	//a)
	public static Integer cuentaVocales(String palabra){
		Integer numVoc = 0;
		
		for(Character c : palabra.trim().toLowerCase().toCharArray()){
			
		//Tambien se puede hacer      if("aeiou".contains(c.toString()){....}
			
			if(c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u')){
				numVoc ++;
			}
		}
		return numVoc;
	}
	//b)
	public static String invierteCadena(String palabra){
		String inversa = "";
		//Convertimos la cadena en una tabla con os caracteres de la palabra
		char[] tablaPalabra = new char[palabra.length()];
		tablaPalabra = palabra.toCharArray();
		//vamos a copiar la palabra invertida en la variable invertida
		for(int i = tablaPalabra.length - 1; i >= 0; i--){
			inversa += tablaPalabra[i];
		}
		return inversa;
		
	}
	//c)
	public static Boolean esPalindroma(String palabra){
		Boolean palindroma = true;
		
		//Convertimos la palabra en una tabla
		char[] pal = new char[palabra.length()];
		pal = palabra.toCharArray();
		
		for (int i = 0; i <= pal.length/2 ; i++ ){
			if(pal[i] != pal[pal.length -1 -i]){
				palindroma = false;
			}
		}
		
		return palindroma;
	}
	
	//d)
	public static Integer cuentaApariciones(String palabra, Character caracter){
		Integer result = 0;
		char[] aux = new char[palabra.length()];
		aux = palabra.toCharArray();
		for (int i = 0; i < aux.length; i++) {
			//Si lo encontramos sumamos una aparición
			if(caracter.equals(aux[i])){
				result++;
			}
		}
		return result;
	}
	
}
