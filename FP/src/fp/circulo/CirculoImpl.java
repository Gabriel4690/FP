package fp.circulo;

import fp.punto.Punto;
import fp.punto.PuntoImpl;

public class CirculoImpl implements Circulo {
	
	private Double radio; 
	private Punto centro;
	
	public CirculoImpl(){
		this.radio = 0.0;
		this.centro = new PuntoImpl();
	}
	public CirculoImpl(Double radio, Punto centro){
		this.radio = radio;
		this.centro = centro;
	}

	@Override
	public Punto getCentro() {
		return this.centro;
	}

	@Override
	public Double getRadio() {
		return this.radio;
	}

	@Override
	public Double getArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}

	@Override
	public Double getLongitud() {
		return this.radio*2*Math.PI;
	}

	@Override
	public void setCentro(Punto p) {
		this.centro = p;
		
	}

	@Override
	public void setRadio(Double r) {
		this.radio = r;		
	}
	
	public String toString(){
		return "" + this.getCentro() + " r= " + this.getRadio() + " A= " + this.getArea() + " L= " + this.getLongitud() ;
		
	}
}
