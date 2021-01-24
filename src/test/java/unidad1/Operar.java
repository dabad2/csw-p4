package unidad1;

import static org.junit.Assert.assertEquals;

//Se crea la clase OPERAR
public class Operar {

	//Atributos
	private int operando1;
	private int operando2;
	private int resultado = 0;
	private boolean signonegativo;
	String cadena;
	
	//Constructor (Siempre se ejecuta println creando instancias a las subclases)
	public Operar() {
		
		//System.out.println("Estás en el método Operar");

	}
	
	//Constructor
	public Operar(int operando1, int operando2) {
		
	this.operando1 = operando1;
	this.operando2 = operando2;

	}
	
	//Método
	public int sumar(int operando1, int operando2){
			
		    	resultado = operando1 + operando2;

    return resultado;
    }
	
	//Método
	public String restar(int operando1, int operando2){
		
		if (operando1-operando2 < 0) {
			 cadena = "La operación da resultado negativo";
				
	 	}

    return cadena;
    }
	
	//Método
	public String multiplicar(int operando1, int operando2){
		
		    	cadena = String.valueOf(operando1 * operando2);
		      

    return cadena;
    }
	
	//Método
	public int dividir(int operando1, int operando2){
		
    			resultado = operando1 / operando2;

    return resultado;
}
	//Método
	public boolean signonegativo(int operando1, int operando2){
			
		if (operando1-operando2 < 0) {
			 signonegativo = true;
				
	 	}
		    	
    return signonegativo;
    }
	
	//Método
	public int[] array(int operando1, int operando2){
		
		
			int arraysalida[] = {operando1,2,4,6,8,operando2};
		
			    	
	    return arraysalida;
	}
	
}
