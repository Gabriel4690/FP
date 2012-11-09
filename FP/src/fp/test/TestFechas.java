package fp.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import fp.util.Fechas;

public class TestFechas extends Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calendar c = new GregorianCalendar(2012, Calendar.OCTOBER, 26);
		mostrar(Fechas.toString(c));
		mostrar("Final de año a : ", Fechas.numeroDiasHastaFinAnyo(c));
		mostrar(Fechas.toString(c));
	}

}
