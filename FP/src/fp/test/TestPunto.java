package fp.test;

import fp.punto.Punto;
import fp.punto.PuntoImpl;

public class TestPunto extends Test {//Todas las clases test derivan de test

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Clase para probar la clase punto
		
		Punto p = new PuntoImpl(2.0,3.0);
		mostrar("Punto: " , p);
		p.setX(3.0);
		mostrar("Punto: " , p);
		p.setY(2.0);
		mostrar("Punto: " , p);
		
		Punto p2 = new PuntoImpl(-1.0,-3.0);
		
		Double distancia = p.distanciaAOtroPunto(p2);
		mostrar("Distancia: ", distancia);

	}

}
