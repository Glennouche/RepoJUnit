package junit;

//import org.junit.Assert; // Prendre celui là (l'autre étant déprécié)
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
		// Dès que une assertion est fausse l'unité de test en entier est considérée comme fausse
		//fail("Not yet implemented");
	}
}
