package program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2022-07-20"); //hora local
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T28:20:30"); //hora local com tempo
		Instant d03 = Instant.parse("2022-07-20T28:20:30Z"); //hora e tempo com fuso horario
		
		//converter uma data com fuso horario para o fuso horario do meu computador
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		System.out.println("Resultado: " + r1);
		
		//converter uma data com fuso horario para o fuso horario de portugal
		
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println("Resultado 2: " + r2);
		
		//Pegar um elemento especifico da data (usar a funcao get)
		
		System.out.println("Dia da data D01: " + d01.getDayOfMonth());
	}

}
