package unidad1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Operar operar = new Operar(0,0);
		int res = operar.sumar(2, 3);
		System.out.println("La suma es: " + res);
		
		/*System.out.println("BIENVENID@ A LA CALCULADORA SENCILLA ");
		Scanner teclado = new Scanner(System.in);

		//USO DE SUBCLASES DE LA CLASE "Operar"
		System.out.println("Introduzca Operando 1: ");
		int operando1 = teclado.nextInt();

		System.out.println("Introduzca Operando 2: ");
		int operando2 = teclado.nextInt();

		//Se crea el Objeto como Clase Suma
		Operar Operar1 = new Suma();
		System.out.println("Resultado Suma: " + Operar1.resultado(operando1, operando2));

		//Se crea el Objeto como Clase Resta
		Operar1 = new Resta();
		System.out.println("Resultado Resta: " + Operar1.resultado(operando1, operando2));

		//Se crea el Objeto como Clase Multiplicacion
		Operar1 = new Multiplicacion();
		System.out.println("Resultado Multiplicación: " + Operar1.resultado(operando1, operando2));
		
		//Se crea el Objeto como Clase Division
		Operar1 = new Division();
		System.out.println("Resultado División: " + Operar1.resultado(operando1, operando2));
		
		
		//USO DIRECTO DE LA CLASE "Operar"
		System.out.println("Pulse 1 para Sumar, Pulse 2 para Restar, Pulse 3 para Multiplicar, Pulse 4 para Dividir: ");
		int op = teclado.nextInt();
		Operar Operar2 = new Operar(op);
		System.out.println("Resultado de su operación: " + Operar2.resultado(operando1, operando2));
		
		teclado.close();
		*/
		
	} 

}