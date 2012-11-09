package fp.tipos;

import fp.excepciones.AsientoNoValidoException;
import fp.persona.PersonaImpl;

public class PasajeroImpl extends PersonaImpl implements Pasajero  {
	
	
	private Integer fila;
	private Character letraAsiento;
	
	public PasajeroImpl(){
		super();
		this.fila = 0;
		this.letraAsiento = 'A';
		
	}
	public PasajeroImpl(String dni, String nombre, String apellidos, Integer fila, Character letraAsiento){
		super(dni, nombre, apellidos);
		//Excepciones
		//Vamos a suponer que existen 40 filas como nos dice el enunciado
		if(!(fila >= 0 &&  fila <= 40)){
			throw new AsientoNoValidoException();	
		}
		if(!(letraAsiento >= 'A' &&  letraAsiento <= 'F' || letraAsiento.equals(" "))){
			throw new AsientoNoValidoException();	
		}
		this.fila = fila;
		this.letraAsiento = letraAsiento;
	}
	
	
	@Override
	public Integer getFila() {
		// TODO Auto-generated method stub
		return this.fila;
	}

	@Override
	public Character getLetraAsiento() {
		// TODO Auto-generated method stub
		return this.letraAsiento;
	}

	@Override
	public void setFila(Integer fila) {
		if(!(fila >= 0 &&  fila <= 40)){
			throw new AsientoNoValidoException();	
		}
		
		this.fila = fila;
		
	}

	@Override
	public void setLetraAsiento(Character letra) {
		if(!(letraAsiento >= 'A' &&  letraAsiento <= 'F' || letraAsiento.equals(" "))){
			throw new AsientoNoValidoException();	
		}
		
		this.letraAsiento = letra;
		
	}
	
	public String toString(){
		return "" + super.toString() + " - Asiento: " + this.getFila() + this.getLetraAsiento() ;
	}

}
