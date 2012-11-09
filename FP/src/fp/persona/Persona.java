package fp.persona;

//EJERCICIO 6 TEMA 1
//ESPECIFIQUE EL TIPO PERSONA, CON LAS PROPIEDADES:DNI, NOMBRE, APELLIDOS (TODAS TIPO CADENA)
//ESCRIBIR INTERFAZ Y LA CLASE QUE LA IMPLEMENTA

public interface Persona {
	
	//La propiedades de una persona nombre y apellidos son poco frecuente que se modifiquen, auenque posible.
	/*	Por ello diremos que las propiedades nteriormente nombradas son observables y modificables.
	 * 	DNI -> observable
	 */
	
	//Observaables
	String getNombre();
	String getApellidos();
	String getDni();
	//Modificables
	void setNombre(String nombre);
	void setApellidos(String apellidos);

}
