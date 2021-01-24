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

  
//4 asertos con éxito
 @Test
 public void testSumar() {
	 
	 assertEquals(3, operar1.sumar(1, 2));
 }
}