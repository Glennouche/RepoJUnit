package junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FiboTest {
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BEFORE CLASS");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AFTER CLASS");
	}
	
	
	@Before // MEthode appelée avant chaque methode de test
	public void beforeEach() {
		System.out.println("Before");
	}
	
	@After // MEthode appelée après chaque methode de test
	public void afterEach() {
		System.out.println("After");
	}

	@Test
	public void fiPositiveValuesCheck() {
		assertEquals("Fibo(0) ==> 0", 0, FiboSuite.fibo(0));
		assertEquals("Fibo(1) ==> 1", 1, FiboSuite.fibo(1));
		assertEquals("Fibo(2) ==> 1", 1, FiboSuite.fibo(2));
		assertEquals("Fibo(3) ==> 2", 2, FiboSuite.fibo(3));
		assertEquals("Fibo(4) ==> 3", 3, FiboSuite.fibo(4));
		assertEquals("Fibo(14) ==> 377",377 , FiboSuite.fibo(14));
		assertEquals("Fibo(25) ==> 75025",75025 , FiboSuite.fibo(25));
		// fib(n) > Interger.MAX_VALUE
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void fiboNegativeValuesCheck() {
		FiboSuite.fibo(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void fiboMaxAcceptedValue() {
		FiboSuite.fibo(47);
	}

}
