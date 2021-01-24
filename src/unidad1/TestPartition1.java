package unidad1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;


//PRUEBAS PARA LOS MÉTODOS DE LA CATEGORÍA CÁLCULO
public class TestPartition1 {
	
	
	int[] stringesperado = {1,2,4,6,8,2};
	int operando1 = 1; int operando2 = 2;
	Operar operar1 = new Operar(0,0);
	  
	 @Test
	 public void testSumar() { 
		 assertEquals(3, operar1.sumar(operando1, operando2));
	 }
	 
	 @Test
	 public void testmultiplicar() {

		 assertNotSame(2, operar1.multiplicar(operando1,operando2));		 
	 }

	 @Test
	 public void testdividir() {
		 assertSame(2, operar1.dividir(operando2,operando1)); 
	 }

	 @Test
	 public void testarray() {
		 assertArrayEquals(stringesperado, operar1.array(operando1,operando2)); 
	 }

}
