package fp.excepciones;

public class LibroNoValidoException extends RuntimeException {

	public LibroNoValidoException(){
		//Llamada implicita a: super();
	}

	public LibroNoValidoException(String s){
		super(s);
	}
}
