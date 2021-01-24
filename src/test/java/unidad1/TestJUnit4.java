package unidad1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertArrayEquals;


public class TestJUnit4 {
	
int[] stringesperado = {0,2,4,6,8,10};
int operando1 = 1; int operando2 = 2;
Operar operar1 = new Operar(0,0);

  
//4 asertos con éxito
 @Test
 public void testSumar() {
	 
	 assertEquals(3, operar1.sumar(operando1, operando2));
 }

 @Test
 public void testsignonegativo() {
	 assertTrue(operar1.signonegativo(operando1, operando2)); 
 }
 
 @Test
 public void test2signonegativo() {
	 assertFalse(operar1.signonegativo(operando2, operando1)); 
 }
 
 @Test
 public void testrestar() {
	 assertNotNull(operar1.restar(operando1,operando2)); 
 }
 
//4 asertos con error
 @Test
 public void testrestar2() {
	 assertNull(operar1.restar(operando1,operando2)); 
 }
 @Test
 public void testmultiplicar() {
	 assertSame(2, operar1.multiplicar(operando1,operando2)); 
 }

 @Test
 public void testdividir() {
	 assertNotSame(2, operar1.dividir(operando2,operando1)); 
 }

 @Test
 public void testarray() {
	 assertArrayEquals(stringesperado, operar1.array(operando1,operando2)); 
 }
 
}