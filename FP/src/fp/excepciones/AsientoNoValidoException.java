package fp.excepciones;

public class AsientoNoValidoException extends RuntimeException{
	
	public AsientoNoValidoException(){
		super();
	}
	public AsientoNoValidoException(String s){
		super(s);
	}
}
