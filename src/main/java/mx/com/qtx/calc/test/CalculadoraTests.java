package mx.com.qtx.calc.test;

import mx.com.qtx.calc.servicios.Calculadora;

public class CalculadoraTests {

	public static void main(String[] args) {
		Calculadora miMaizro = new Calculadora();
		int resultado= (int) miMaizro.sumar(34, 69);
		System.out.println("EL resultado de la suma "+resultado);
		System.out.println("EL resultado de la divi "+miMaizro.dividir(150, 100));
	}

}
