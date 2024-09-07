package mx.com.qtx.calc.test;

import mx.com.qtx.calc.servicios.Calculadora;

public class CalculadoraTests {

	public static void main(String[] args) {
		test_suma();
	}

	private static void test_suma() {
		Calculadora miMaizro = new Calculadora();
		int resultado= (int) miMaizro.sumar(34, 69);
		System.out.println("EL resultado de la suma "+resultado);
	}

}
