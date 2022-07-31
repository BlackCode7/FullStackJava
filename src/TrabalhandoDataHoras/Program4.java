package TrabalhandoDataHoras;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program4 {

	public static void main(String[] args) {

		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		// Instancia de data-hora - AGORA
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); // Instante de Londres
		
		/* convertendo string em objeto */
		LocalDate d04 = LocalDate.parse("2022-07-30");// convertendo string em objeto
		LocalDateTime d05 = LocalDateTime.parse("2022-07-30T01:30:26");// convertendo string em objeto
		Instant d06 = Instant.parse("2022-07-30T02:30:32Z");// convertendo string em objeto
		Instant d07 = Instant.parse("2022-07-30T02:30:32-03:00");// convertendo string em objeto
		
		/* Especificando o formato desejado usando a barra como divisor de dia/mês/ano */
		/* DateTimeFormatter - usado para formatar data */
		/* OBS - Neste caso podemos usar a classe DateTimeFormatter() qunado trabalhamos com o formato de data do padrão brasileiro*/
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d08 = LocalDate.parse("30/07/2022", fmt1);// este método aceita uma sobre carga para formatar texto
		LocalDate d09 = LocalDate.parse("30/07/2022 07:17", fmt2);
		
		/* Instanciando dia mês ano */
		LocalDate d10 = LocalDate.of(2022, 7, 15);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 15, 12, 30);
		
		
		System.out.println();
		System.out.println("d01: "+d01+ " - Data instante agora !");
		System.out.println("d02: "+d02+ " - com fração de segundos !");
		System.out.println("d03: "+d03+ " - Data Hora de Londres - fuso horário de 4h à frente !");
		System.out.println("d04: "+d04+ " - transformando string em objeto LocalDate()");
		System.out.println("d05: "+d05+ " - transformando string em objeto LocalDate()");
		System.out.println("d06: "+d06+ " - transformando string em objeto LocalDate()");
		System.out.println("d07: "+d07+ " - transformando string em objeto LocalDate() - subtraindo do horário de Londres - 3h");

		System.out.println();
		System.out.println("d08: "+d08+ " - Data instante agora! - Usando a barra como divisor de dia/mês/ano - Usando DateTimeFormatter()");
		System.out.println("d09: "+d09+ " - Data instante agora! - Usando a barra como divisor de dia/mês/ano - Usando DateTimeFormatter()");
		
		System.out.println();
		System.out.println("d10: "+d10+ " - trabalhando com dia/mês/anos separados");
		System.out.println("d11: "+d11+ " - trabalhando com dia/mês/anos/horas/minutos separados");
		
		
	}

}
