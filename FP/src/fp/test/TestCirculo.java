package fp.test;

import fp.circulo.Circulo;
import fp.circulo.CirculoImpl;
import fp.punto.Punto;
import fp.punto.PuntoImpl;

public class TestCirculo extends Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Circulo circ = new CirculoImpl(5.0,new PuntoImpl(0.0,1.0));
		//Mostramos el circulo creado
		mostrar(circ);
		//Cambiamos el centro y el radio
		Punto p = new PuntoImpl(1.0,2.0);
		circ.setCentro(p);
		circ.setRadio(6.0);
		//Mostramos el circulo tras los cambios
		mostrar("Cambios en el circulo: ", circ);
		
		//mostrar(Math.PI);//Probando PI
	}

}
