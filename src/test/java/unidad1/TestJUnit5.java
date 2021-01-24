package unidad1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Disabled;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertArrayEquals;


public class TestJUnit5 {
	
int[] stringesperado = {0,2,4,6,8,10};
int operando1; int operando2;
Operar operar1 = new Operar(0,0);

//ANNOTATION
 @BeforeAll
 public static void avisoinicial(){
     System.out.println("La ejecución de las pruebas ha comenzado.");
    
 }
 
 @BeforeEach
 public void establecevalores(){
	 System.out.println("Asignando valores a los atributos al entrar al test");
	 operando1 = 1000; operando2 = 2;		
 }
 
  
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
 
 @Disabled	//ANNOTATION @Disabled
 @Test
 public void testarray() {
	 assertArrayEquals(stringesperado, operar1.array(operando1,operando2)); 
 }
 
 //ANNOTATION
 @AfterEach
 public void inicializacevalores(){
     System.out.println("Asinando valor 0 los atributos al salir del test");
     operando1 = 0; operando2 = 0;
 }
 
 @AfterAll
 public static void avisofinal(){
     System.out.println("La ejecución de las pruebas ha finalizado.");
 }
 
}