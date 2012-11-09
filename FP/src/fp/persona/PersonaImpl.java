package fp.persona;

public class PersonaImpl implements Persona {
	
	//Atributos
	private String nombre;
	private String apellidos;
	private String dni;
	
	public PersonaImpl(){
		this.nombre = "";
		this.apellidos = "";
		this.dni = "";	
	}	
	//Constructor de la clase con parametros
	public PersonaImpl(String nombre, String apellidos, String dni){
		this.nombre =   nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	
	//Matodos
	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String getApellidos() {
		return this.apellidos;
	}

	@Override
	public String getDni() {
		return this.dni;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}

	@Override
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
		
	}
	
	public String toString(){
		return "" + this.getNombre() + " " + this.getApellidos() + " " + this.getDni();
	}

}
