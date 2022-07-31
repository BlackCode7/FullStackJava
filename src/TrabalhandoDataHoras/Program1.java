package TrabalhandoDataHoras;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program1 {

	public static void main(String[] args) {
		
		/* CALCULANDO DATA E HORAS */
		/* NAO POSSO MODIFICAR O OBJETO */
		
		LocalDate d04 = LocalDate.parse("2022-07-30");// convertendo string em objeto
		LocalDateTime d05 = LocalDateTime.parse("2022-07-30T01:30:26");// convertendo string em objeto
		Instant d06 = Instant.parse("2022-07-30T02:30:32Z");// convertendo string em objeto
		
		/* Criando um objeto diferente do original Instant */
		//Instant pastDaysInstant = d06.minus(7, ChronoUnit.DAYS);
		//Instant nextDaysInstant = d06.plus(7, ChronoUnit.DAYS);
		//System.out.println("Instant subtração ChronoUnit = " + pastDaysInstant);
		//System.out.println("Instant adição ChronoUnit = " + nextDaysInstant);
		
		System.out.println();
		/* Criando um objeto diferente do original LocalDateTime */
		LocalDateTime pastDaysLocalDateTime = d05.minusDays(7);
		LocalDateTime nextDaysLocalDateTime = d05.plusDays(7);
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(7);
		LocalDateTime pastYearsLocalDateTime = d05.minusYears(10);
		LocalDateTime nextYearsLocalDateTime = d05.plusYears(10);
		System.out.println("Com subtração de 7 dias = " + pastDaysLocalDateTime);
		System.out.println("Com adição de 7 dias = " + nextDaysLocalDateTime);
		System.out.println("Com subtração de 7 semanas = " + pastWeekLocalDateTime);
		System.out.println("Com adição de semanas = " + nextWeekLocalDateTime);
		System.out.println("Com subtração de 10 anos = " + pastYearsLocalDateTime);
		System.out.println("Com adição de 10 anos = " + nextYearsLocalDateTime);
		
		System.out.println();
		
		/* Criando um objeto diferente do original LocalDate */
		LocalDate pastWeekLocaldate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusWeeks(7);
		LocalDate nextYearLocalDate = d04.plusYears(7);
		LocalDate pastYearLocalDate = d04.minusYears(7);
		
		System.out.println("Com subtração de 1 semana = " + pastWeekLocaldate);
		System.out.println("Com adição de 1 semana = " + nextWeekLocalDate);
		System.out.println("Com subtração de 7 anos = " + pastYearLocalDate);
		System.out.println("Com adição de 7 anos = " + nextYearLocalDate);	
		
		System.out.println();
		//Duration t3 = Duration.between(pastWeekInstance, d06);
		
		System.out.println();
		Duration t1 = Duration.between(pastWeekLocaldate.atStartOfDay(), d04.atStartOfDay());
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t1 dias = " + t1.toDaysPart());
		System.out.println("t1 dias em horas = " + t1.toHours());

		System.out.println();
		/* Calculod e periódo entre datas */
		Duration t2 = Duration.between(pastWeekLocaldate, d04);
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t2 dias = " + t2.toDaysPart());
		System.out.println("t2 dias em horas = " + t2.toHours());
		
		
		

	}

}
