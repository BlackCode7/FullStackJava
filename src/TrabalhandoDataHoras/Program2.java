package TrabalhandoDataHoras;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalField;

public class Program2 {

	
	
	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-30");// convertendo string em objeto
		LocalDateTime d05 = LocalDateTime.parse("2022-07-30T01:30:26");// convertendo string em objeto
		Instant d06 = Instant.parse("2022-07-30T02:30:32Z");// convertendo string em objeto
		
		LocalDate resultado1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate resultado2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime resultado3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime resultado4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		
			
		/* COMO PEGAR O DIA DE UMA DATA LOCAL */
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 compareTo() = " + d04.compareTo(resultado2));
		System.out.println("d04 dia do mes = " + d04.getDayOfMonth());
		System.out.println("d04 dia do ano = " + d04.getDayOfYear());
		System.out.println("d04 dia do mês = " + d04.getMonthValue());
		System.out.println("d04 pegando ano = " + d04.getYear());
		
		System.out.println();
		System.out.println("Pegando Hora / Minuto / Segundo");
		System.out.println( "d05 Hora contida na variável = " + d05.getHour());
		System.out.println( "d05 Minuto contida na variável = " + d05.getMinute());
		System.out.println( "d05 Segundos contida na variável = " + d05.getSecond() );
		
		
		System.out.println();
		// OBSERVAÇÃO
		//System.out.println("d04 dia do ano) = " + d04.getLong(null));
		//System.out.println("d04 compareTo() = " + d04.getLong(numbers));
		
		
		System.out.println("resultado1 = " + resultado1);
		System.out.println("resultado2 = " + resultado2);
		System.out.println("resultado3 = " + resultado3);
		System.out.println("resultado4 = " + resultado4);
		
		/* Converte data global para local - tem que usar o timezone 
		for ( String s: ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}*/
		

	}

	

}
