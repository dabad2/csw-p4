package unidad1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

//PRUEBAS PARA LOS MÉTODOS DE LA CATEGORÍA CONSULTAS
public class TestPartition2 {
	
int operando1 = 1; int operando2 = 2;
Operar operar1 = new Operar(0,0);

	@Test
	 public void test2signonegativo() {
		 assertFalse(operar1.signonegativo(operando2, operando1)); 
	 }
	 
	 @Test
	 public void testrestar() {
		 assertNotNull(operar1.restar(operando1,operando2)); 
	 }

}
