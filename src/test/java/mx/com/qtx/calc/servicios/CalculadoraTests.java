package mx.com.qtx.calc.servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CalculadoraTests {

	@Test
	void testSumar_enteros() {
		//dados -> datos de entrada 
		int sumando1 =100;
		int sumando2=50;
		//cuando ->Ejecucion del codigo a probar
		Calculadora miMaizoro = new Calculadora();
		double suma = miMaizoro.sumar(sumando1, sumando2);
		//Entonces -> Probar el resultado
		assertEquals(150, suma, 0.0000000001, "El valor no coincide con el contenido");

	}
	@Test
	void testSumar_doubles() {
		//dados -> datos de entrada 
		double sumando1 =99.5;
		double sumando2=50.55;
		//cuando ->Ejecucion del codigo a probar
		Calculadora miMaizoro = new Calculadora();
		double suma = miMaizoro.sumar(sumando1, sumando2);
		//Entonces -> Probar el resultado
		assertEquals(150, suma, 0.0000000001, "El valor no coincide con el contenido");

	}

}
