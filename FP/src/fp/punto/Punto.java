package fp.punto;

public interface Punto {
	//En la interfaz vamos a definir las funciones que vamos a utilizar.
	
	//Serian los metodos de las propiedades observables.
	Double getX();
	Double getY();
	//Metodos de las propiedades modificables.
	void setX(Double x);
	void setY(Double y);
	
	Double distanciaAOtroPunto(Punto p);

}
