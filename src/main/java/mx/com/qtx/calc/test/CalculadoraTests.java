package mx.com.qtx.calc.test;

import mx.com.qtx.calc.servicios.Calculadora;

public class CalculadoraTests {

	public static void main(String[] args) {
		Calculadora miMaizro = new Calculadora();
		double resultado= miMaizro.sumar( 100,  150);
		System.out.println("EL resultado de la suma "+resultado);
		System.out.println("EL resultado de la restra "+miMaizro.restar(100, 150));
		System.out.println("EL resultado de la multiplicar "+miMaizro.multitplicar(100, 150));
		System.out.println("EL resultado de la divi "+miMaizro.dividir(150, 100));

	}

}
