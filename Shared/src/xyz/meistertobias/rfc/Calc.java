package xyz.meistertobias.rfc;

public class Calc implements CalcRFC {
	
	@Override
	public int add(int x, int y) {
		return x + y;
	}
	
	@Override
	public int subtract(int x, int y) {
		return x - y;
	}
	
	@Override
	public int multiply(int x, int y) {
		return x * y;
	}
	
	@Override
	public int divide(int x, int y) {
		return x / y;
	}
}
