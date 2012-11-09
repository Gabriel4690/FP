package fp.util;

import java.util.Calendar;

public class Fechas {


	public static Boolean esBisiesto(Calendar c){
		Integer ano = c.get(Calendar.YEAR);
		
		return  (ano % 400 == 0 || (ano % 4 == 0  &&  ano % 100 != 0)); // ponemos los parentesis para ver mejor el orden de las operaciones.
	}
	
	public static Integer getDiasMes(Calendar c){
		Integer result;
		Integer mes = c.get(Calendar.MONTH) + 1;
		
		switch (mes) {
			case 4:
			case 6:
			case 9:
			case 11:
				result = 30;
				break;
			case 2:
				if(esBisiesto(c)){
					result = 29;
				}else{
					result = 28;
				}
				break;
			default:
				result = 31;
		}
		return result;
	}
	
	public static String toString(Calendar c){		
		return  c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH ) +1) + "/" + c.get(Calendar.YEAR);
		
	}
	
	public static Integer numeroDiasHastaFinAnyo(Calendar fecha){
		Integer numDias= getDiasMes(fecha)- fecha.get(Calendar.DAY_OF_MONTH);
		fecha.set(Calendar.MONTH, fecha.get(Calendar.MONTH) + 1);
		while(fecha.get(Calendar.MONTH) < 11){
		numDias += getDiasMes(fecha);
		fecha.set(Calendar.MONTH, fecha.get(Calendar.MONTH) + 1);
		}
		numDias += getDiasMes(fecha);
		return numDias;
		}
	

}
