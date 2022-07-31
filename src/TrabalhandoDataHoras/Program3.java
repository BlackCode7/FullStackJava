package TrabalhandoDataHoras;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program3 {

	public static void main(String[] args) {

		/* convertendo string em objeto */
		/* Trabalhando com o formato Brasileiro de datas com dd/mês/ano */
		
		LocalDate d04 = LocalDate.parse("2022-07-30");// convertendo string em objeto
		LocalDateTime d05 = LocalDateTime.parse("2022-07-30T01:30:26");// convertendo string em objeto
		Instant d06 = Instant.parse("2022-07-30T02:30:32Z");// convertendo string em objeto
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());// Pega a hora do computador do usuário
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;// É uma data local	
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println();
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		
		System.out.println();
		System.out.println("d06 = " + fmt3.format(d06));
		
		System.out.println();
		System.out.println("d04" + d04.format(fmt4));
		System.out.println("d06" + fmt3.format(d06));
		System.out.println("d06" + fmt5.format(d06));
		System.out.println("d06" + d06.toString());
		

	}

}
