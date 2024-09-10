package mx.com.qtx.calc.servicios;

public class Calculadora {

	public <T extends Number> double sumar(T x, T y) {
		double suma  = x.doubleValue() + y.doubleValue();
		return suma;
	}
	public int restar(int x, int y) {
		int suma = x - y;
		return suma;
	}
	public int multitplicar(int x, int y) {
		int suma = x * y;
		return suma;
	}

	public <T extends Number> double dividir(T x, T y) {
		double suma  = x.doubleValue() / y.doubleValue();
		return suma;
	}

}
