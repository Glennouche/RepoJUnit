package junit;

//import org.junit.Assert; // Prendre celui l� (l'autre �tant d�pr�ci�)
import static org.junit.Assert.*;
import org.junit.Test;



public class HelloJUnitTest {

	@Test // JUnit4
	public void helloShouldReturnHello() {
		// Approche en 3 temps :
		//GIVEN
		HelloJUnit helloJunit = new HelloJUnit();
		//WHEN
		String result = helloJunit.hello();
		//THEN
		// je dois garantir que "hello".equals(result)
		assertEquals("helloJUnit.hello() should equals hello","hello" ,result);
		assertTrue("helloJUnit.hello() should equals hello TDB", "hell".equals(result));
		// D�s que une assertion est fausse l'unit� de test en entier est consid�r�e comme fausse
		//fail("Not yet implemented");
	}
}
