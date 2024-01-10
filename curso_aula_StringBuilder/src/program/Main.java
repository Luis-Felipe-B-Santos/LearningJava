package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

//os dads ja estao hard coded dessa vez, nao havera captura;
public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date momento = fmt.parse("21/06/2018 13:05:44");
		String titulo = "Traveling to New Zealand";
		String conteudo = "I'm going to visit this wonderful country!";
		Integer likes = 12;
		String texto1 = "Have a nice trip";
		String texto2 = "Wow that´s awesome!";
		
		Post post1 = new Post(momento, titulo, conteudo, likes);
		Comment comentario1 = new Comment(texto1);
		Comment comentario2 = new Comment(texto2);
		
		post1.addComments(comentario1);
		post1.addComments(comentario2);
		
		Date momento1 = fmt.parse("28/07/2018 23:14:19");
		String titulo1 = "Good night guys";
		String conteudo1 = "See you tomorrow";
		Integer likes1 = 5;
		String texto3 = "Good night";
		String texto4 = "May the force be with you";
		
		Post post2 = new Post(momento1, titulo1, conteudo1, likes1);
		Comment comentario3 = new Comment(texto3);
		Comment comentario4 = new Comment(texto4);
		
		post2.addComments(comentario3);
		post2.addComments(comentario4);
		
		System.out.println(post1);
		System.out.println(post2);
		
		
	}

}
