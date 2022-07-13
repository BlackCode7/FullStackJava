package TesteClassFormatMoney;

import java.text.NumberFormat;
import java.util.Locale;

class TesteClassFormatMoney {
	
	static String simbolPT = "pt";
	static String simbolUS = "en";
	static double money = 707755458.27;
	
	static Locale localeUs = new Locale("en", "UK");
	static Locale localeBR = new Locale("pt", "BR");
	NumberFormat numberUS = NumberFormat.getCurrencyInstance(localeUs);
	NumberFormat numberPT = NumberFormat.getCurrencyInstance(localeBR);

	public static void main(String[] args) {
		//System.out.println( format(money) );
		System.out.println( formatNumberPathPT_US(simbolPT, money) );
	}
	
	 public static double formatNumberPathPT_US(String simbol , double money2) {
		double formatter = money2;
		
		
		return formatter;
    }

	 
	/* Pontuação de moedas
	 * 
	 * USA  >>> 00,000,000.00
	 * PTBR / EURO / COLOMBIANO / URUGUAIO  / ARGENTINO / LIBRA ESTERLINA >>> 00.000.000,00
		 	 
	 *  >>>
    */
}
