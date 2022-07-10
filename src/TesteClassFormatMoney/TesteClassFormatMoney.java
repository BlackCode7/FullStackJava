package TesteClassFormatMoney;

import java.text.DecimalFormat;
import java.util.Locale;

class TesteClassFormatMoney {
	
	static double money = 70.27;

	public static void main(String[] args) {
		//System.out.println( format(money) );
		System.out.println( formatNumberPathPTBR(money) );
	}
	
	 public static String formatNumberPathPTBR(double value) {
        DecimalFormat formatter;
        if (value<=99999)
          formatter = new DecimalFormat("###,###,##0.00");
        else
            formatter = new DecimalFormat("#,##,##,###.00");
        return formatter.format(value);
    }

	 
	/* Pontuação de moedas
	 * 
	 * USA  >>> 00,000,000.00
	 * PTBR / EURO / COLOMBIANO / URUGUAIO  / ARGENTINO / LIBRA ESTERLINA >>> 00.000.000,00
		 	 
	 *  >>>
    */
}
