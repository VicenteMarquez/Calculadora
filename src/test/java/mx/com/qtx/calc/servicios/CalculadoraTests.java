package mx.com.qtx.calc.servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculadoraTests {

	@Test
	void testSumar() {
		//dados
		int num1=1500;
		int num2=1500;
		//cuand0
		 Calculadora miMaizoro= new Calculadora();
		 double suma = miMaizoro.sumar(num1, num2);
		 //entoinces
		 assertEquals(3000,suma,"No fue cierto");
	}

	@Test
	void testRestar() {
		//dados
				int num1=1500;
				int num2=1500;
				//cuand0
				 Calculadora miMaizoro= new Calculadora();
				 int suma = miMaizoro.restar(num1, num2);
				 //entoinces
				 assertEquals(0,suma,"No fue cierto");
	}

	@Test
	void testMultitplicar() {
		//dados
				int num1=1500;
				int num2=2;
				//cuand0
				 Calculadora miMaizoro= new Calculadora();
				 int suma = miMaizoro.multitplicar(num1, num2);
				 //entoinces
				 assertEquals(3000,suma,"No fue cierto");
	}

}
