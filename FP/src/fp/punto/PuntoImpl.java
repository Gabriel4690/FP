package fp.punto;

public class PuntoImpl implements Punto {//El 
	
	//Atributos de la clase
	private Double x;
	private Double y;
	
	//Metodo constructor de la clase PuntoImpl
	//Los constructores son metodos de inicializacion de las variables los llama el 'new'
	//el constructor no devuelve nada ni siquiera void
	public PuntoImpl(){
		this.x = 0.0;
		this.y = 0.0;
	}
	public PuntoImpl(Double x, Double y){
		this.x = x;
		this.y = y;
		
	}
	
	//Metodos de la clase
	@Override
	public Double getX() {
		return this.x;
	}

	@Override
	public Double getY() {
		return this.y;
	}

	@Override
	public void setX(Double x) {
		this.x = x;

	}

	@Override
	public void setY(Double y) {
		this.y = y;
	}

	@Override
	public Double distanciaAOtroPunto(Punto p) {
		//Vamos a calcular la distancia entre dos puntos de dos coordenadas
		
		Double xDiff = this.getX() - p.getX();
		Double yDiff = this.getY() - p.getY();
		
		xDiff = xDiff * xDiff; //Podriamos simplificar poniendo xDiff *= xDiff;
		yDiff = yDiff * yDiff; //Podriamos simplificar poniendo yDiff *= yDiff;
		
		return Math.sqrt(xDiff + yDiff);
	}
	
	public String toString(){
		
		return "(" + this.getX() + "," + this.getY() + ")";
				
		
	}

}
