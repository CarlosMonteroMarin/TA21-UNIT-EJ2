package TA21_UNIT_EJ2.TA21_UNIT_EJ2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculosTest {
	
	Calculos calc= new Calculos();
	App main= new App();
	
	@BeforeAll
	public static void testBeforeClass() {
		System.out.println("beforeClass");
	}
	
	@BeforeEach
	public void before() {
		System.out.println("before()");
		calc= new Calculos();	
	}

	
	@AfterEach
	public void after() {
		System.out.println("after()");
	}
	
	@Test
	public void testCalculos() {
	}

	@Test
	void testSuma() {
		double resultado= calc.suma(5, 5);
		double esperado = 10;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testResta() {
		double resultado= calc.resta(5, 5);
		double esperado = 0;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testMulti() {
		double resultado= calc.multi(5, 5);
		double esperado = 25;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testDiv() {
		double resultado= calc.div(5, 5);
		double esperado = 1;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void main() {
		main =new App();
		main.main(null);
	}
	

}
