package program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// como List e uma interface, e necessario usar uma classe que implementa a lista para iniciar
		List<String> list = new ArrayList<>(); // no caso, aqui foi usado a classe ArrayList
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		System.out.println(list.size()); //list.size retorna o tamanho da lista
		for (String x : list) { //para cada elemento X do tipo String contido em list faca
		System.out.println(x); // 
		}
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); //expressao lambda. Nesse caso a expressao retorna um valor verdadeiro
		// remova toda string x, tal que o primeiro char seja igual a M
		for (String x : list) { 
		System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// aqui a lista "list" esta sendo convertida para uma stream, para que seja possivel
		//utilizar o predicado (expressao lambda) filter. Feito o filtro, deve-se reconverter a stream para list
		//porque stream e list nao sao compativeis. Isso e feito atraves da funcao collect 
		for (String x : result) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		//mesmo esquema aqui. Converti a lista inicial "list" para stream
		//usei a funcao filter e coloquei meu predicado
		//nesse caso, a funcao find fisrt foi usada, ela vai informar o primeiro resultado que
		//atenda ao predicado. E necessario utilizar a funcao orElse para informar o que retornar caso
		//nenhum resultado atenda ao predicado
		System.out.println(name);

	}

}
