package fp.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Enteros {

	
	public static Integer maximo(Integer a, Integer b){
//		Integer result = a;
//		if(a < b){
//			result = b;		
//		}
//		
//		return result;
		
		return Math.max(a, b);
	}

	public static Integer maximo(Integer a, Integer b, Integer c){
	//	Integer result = a;
	//	if(b > a && b > c){
	//		result = b;		
	//	}else{
	//		if(c > a && c > b){
	//			result = c;
	//		}
	//	}
	//
	//	return result;
	//reutilizamos el codigo
		Integer maxProvisional = maximo(a,b);
		
		return maximo(maxProvisional, c);
	}

	public static Integer factorial(Integer n){
		Integer result = 1;
		
		for(int i = n; i > 0; i--){
			result *= i; //result = result*i
		}
		return result;
	}
	
	public static Integer sumatorio(Integer a, Integer b, Integer c){
		Integer result = 1;
		
		for(int i = b; i <= c; i++){
			if(i % a == 0){
				result += i; //result = result + i				
			}
		}
		return result;
		
	}
	
	public static boolean primo(Integer n){
		boolean result = true;;
		
		for(int i = 2;i <= Math.sqrt(n); i++){ // podriamos a�adir tab en la condicion del for el result
				result = result && n % i != 0; // si devuelve 0 es porque no seria el numero primo
		}
		
		return result;
	}
	
	public static Integer sumaDigitos(Integer a){
		Integer suma = 0;
		Integer digito = a % 10;
		while((a /= 10)== 0){ // a = a / 10;
			suma += digito;
			digito = a % 10;
		}
		return suma;
	}
	
	public static Integer potencia(Integer a, Integer b){
		return (int) Math.pow(a,b);
	}
	
	//Practica 2.3. Arrays listas y tipo String. 
	//a)
	public static Integer[] initArray(Integer tam){
		Integer[] tabla = new Integer[tam];
		//Como estamos modificando la estructura que estamos utilizando
		//no podemos utilizar el for extendido
		for(int i= 0 ; i < tabla.length; i++){
			tabla[i] = i+1;
		}		
		return tabla;
	}
	//b)
	public static Integer sumaElementos(List<Integer> lista){
		Integer suma = 0;
		for(Integer numero:lista){
			suma += numero;
		}
		return suma;
	}
	//c)
	public static Double mediaAritmetica(List<Integer> lista){
//Una solucion equivalente
//		Integer media = 0;
//		for(Integer numero:lista){
//			media += numero;
//		}
//		media = media/lista.size();
//		return media;
//Debemos de reutilizar el codigo
		return sumaElementos(lista).doubleValue() / lista.size();
	}
	//d)
	public static Integer[] arrayInverso(Integer[] tabla){
		Integer[] tablaInvertida = new Integer[tabla.length];
		for(int i = 0; i < tabla.length; i++){
			tablaInvertida[i] = tabla[tabla.length-1 - i];
		}
		return tablaInvertida;
	}
	//e)
	public static List<Integer> listaInversa(List<Integer> lista){
		List<Integer> listaInversos = new ArrayList<Integer>();
//		Collections.reverse(lista);//Damos la vuelta a la lista de numeros
//		for(Integer numero: lista){
//			listaInversos.add(numero);//Vamos insertando ya la lista en orden invertido
//		}
		for(Integer numero: lista){
			listaInversos.add(0,numero);//Vamos insertando siempre en primera posicion
		}
		return listaInversos;
	}
	//f)
	public static List<Integer> primosMenores(Integer n){
		List<Integer> primosMen = new ArrayList<Integer>();
		for(int i = 1; i <= n ; i++){
			if(Enteros.primo(i)){
				primosMen.add(i);
			}
		}
		return primosMen;
	}
}