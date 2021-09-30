package util;

public class CurrencyConverter {

	public static double dollar;
	public static double qtd;
	public static double percent = 6.0;

	public static double calc1() {
		return (qtd * dollar) + ((qtd * dollar) * percent / 100);
	}

}
