package fp.test;

import fp.persona.Persona;
import fp.persona.PersonaImpl;

public class TestPersona extends Test{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona pers1 = new PersonaImpl("Gabriel","Rodriguez Lopez","53353450M");
		mostrar(pers1);
		
		pers1.setNombre("pitufo colorado");
		mostrar(pers1);
		
		pers1.setApellidos("bob esponja");
		mostrar(pers1);
		
		
	}

}
