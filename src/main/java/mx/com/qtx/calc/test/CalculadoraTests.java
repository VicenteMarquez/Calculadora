package mx.com.qtx.calc.test;

import mx.com.qtx.calc.servicios.Calculadora;

public class CalculadoraTests {

	public static void main(String[] args) {
		Calculadora miMaizro = new Calculadora();
		int resultado= miMaizro.sumar(34, 69);
		System.out.println("EL resultado de la suma "+resultado);
	}

}
