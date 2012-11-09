package fp.tipos;

import fp.persona.Persona;

public interface Pasajero extends Persona {
	
	
	Integer getFila();
	Character getLetraAsiento();
	
	void setFila(Integer fila);
	void setLetraAsiento(Character letra);
}
