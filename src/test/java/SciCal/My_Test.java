package SciCal;
import static org.junit.Assert.*;
import org.junit.Test;

public class My_Test {
    private static final double DELTA = 1e-15;
    My_Main cal = new My_Main();
//TruePositive
	@Test
	public void test_root1() {
		double actual=cal.root(25.0);
		double exp=5.0;
		assertEquals(actual,exp, DELTA);
	}
        @Test
	public void test_root2() {
		double actual=cal.root(100.0);
		double exp=10.0;
		assertEquals(actual,exp, DELTA);
	}
//FalsePositive
        @Test
	public void test_root3() {
		double actual=cal.root(25.0);
		double exp=4.0;
		assertNotEquals(actual,exp, DELTA);
	}
        @Test
	public void test_root4() {
		double actual=cal.root(20.0);
		double exp=4.0;
		assertNotEquals(actual,exp, DELTA);
	}
//TruePositive
	@Test
	public void test_fact1() {
		double actual=cal.factorial(4);
		double exp=24.0;
		assertEquals(actual,exp, DELTA);
	}
        @Test
	public void test_fact2() {
		double actual=cal.factorial(3);
		double exp=6.0;
		assertEquals(actual,exp, DELTA);
	}
//FalsePositive
	@Test
	public void test_fact3() {
		double actual=cal.factorial(6);
		double exp=120;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_fact4() {
		double actual=cal.factorial(16);
		double exp=1240;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_log() {
		double actual=cal.log(145.256);
		double exp=4.978497702968366;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void test_power() {
		double actual=cal.power(2.0,3.0);
		double exp=8.0;
		assertEquals(actual,exp, DELTA);
	}	
	@Test
	public void test_log2() {
		double actual=cal.log(245.256);
		double exp=4.978497702968366;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_power2() {
		double actual=cal.power(3.0,2.0);
		double exp=8.0;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_power3() {
		double actual=cal.power(4.0,3.0);
		double exp=8.0;
		assertNotEquals(actual,exp, DELTA);
	}
}
