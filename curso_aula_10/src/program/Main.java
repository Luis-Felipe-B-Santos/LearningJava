package program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//aula sobre Instanciacao de datas

public class Main {

	public static void main(String[] args) {
		
		//Instanciacao de datas usando o tempo de agora
		
		LocalDate d01 = LocalDate.now(); //instanciar uma data local de agora (apenas dia mes ano)
		System.out.println("d01 = " + d01);
		
		LocalDateTime d02 = LocalDateTime.now(); //data de agora com horario local
		System.out.println("d02 = " + d02);
		
		Instant d03 = Instant.now();
		System.out.println("d03 = " + d03); //instancia data-hora GMT (o Z indica o tempo de londres)
		System.out.println();
//-----------------------------------------------------------------------------------------------//
		
		//Instanciacao de data utilizando um texto no ISO - 8601
		//ISO - 8601 = ano-mes-diaThora:minuto:segundo
		
		LocalDate d04 = LocalDate.parse("2023-10-24");
		System.out.println("d04 = " + d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2023-10-24T20:25:50");
		System.out.println("d05 = " + d05);
		
		Instant d06 = Instant.parse("2023-10-24T20:25:50Z");
		System.out.println("d06 = " + d06);
		
		Instant d07 = Instant.parse("2023-10-24T20:25:50-03:00");
		//instanciei a data utilizando o fuso horario de SP (-3h) e o instant joga no horario GMT
		System.out.println("d07 = " + d07);
		System.out.println();
//-----------------------------------------------------------------------------------------------//
		
		//Instanciacao de data utilizando um texto em formato customizado (nao ISO)
		//Criar um formato para poder iniciar a data. Para facil acesso, pesquisar:
		//java DateTimeFormater e utilizar os codigos para formatacao
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//criei um formato (fmt1) e inicializei com o padrao dia, mes, ano
		
		LocalDate d08 = LocalDate.parse("24/10/2023", fmt1);
		System.out.println("d08 = " + d08);
		//foi imprimido no formato ISO mas deu pra instanciar com o formato customizado
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//criei um segunto formato de padrao dia, mes, ano, hora e minutos
		
		LocalDateTime d09 = LocalDateTime.parse("24/10/2023 17:55", fmt2);
		System.out.println("d09 = " + d09);
		System.out.println();
//-----------------------------------------------------------------------------------------------//
		//Instanciacao de data utilizando dados separados de dia, mes, ano
		
		int ano = 2023; int mes = 10; int dia = 7;
		LocalDate d10 = LocalDate.of(ano, mes, dia);
		//a funcao of pode passar variaveis, possibilitando instanciar com dados separados
		System.out.println("d10 = " + d10);
		
	}

}
