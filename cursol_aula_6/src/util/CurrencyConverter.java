package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double calculator(double dollarPrice, double dollar) {

		double result = dollarPrice * dollar;
		result = result + result * IOF;
		return result;
	}
}
