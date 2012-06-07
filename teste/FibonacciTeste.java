import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTeste {
	
	@Test
	public void testaSequencia(){
		Fibonacci f = new Fibonacci();
		assertEquals(0, f.elemento(1));
		assertEquals(1, f.elemento(2));
		assertEquals(1, f.elemento(3));
		assertEquals(2, f.elemento(4));
		assertEquals(3, f.elemento(5));
		assertEquals(5, f.elemento(6));
		assertEquals(8, f.elemento(7));
		assertEquals(13,f.elemento(8));
		assertEquals(21,f.elemento(9));
		assertEquals(34,f.elemento(10));
	}
	
}
