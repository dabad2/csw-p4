import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class TestJUnit5 {
	
int[] stringesperado = {0,2,4,6,8,10};
int operando1; int operando2;
Operar operar1 = new Operar(0,0);


  
//4 asertos con éxito
 @Test
 public void testSumar() {
	 
	 assertEquals(3, operar1.sumar(3, 2));

 }
}