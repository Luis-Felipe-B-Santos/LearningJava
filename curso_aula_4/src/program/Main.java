package program;

//exercicio de fixacao basico com funcoes uteis para string

public class Main {

	public static void main(String[] args) {
		
		String original = "ABCD efgh IjKL ABC   ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 6);
		String s06 = original.replace('B', 'a');
		String s07 = original.replace("ABC", "String");
		int i = original.indexOf("BC");
		int j = original.lastIndexOf("BC");
		
		System.out.println("Original : " + "-" + original + "-");
		System.out.println("toLowerCase : " + "-" + s01 + "-");
		System.out.println("toUpperCase : " + "-" + s02 + "-");
		System.out.println("trim : " + "-" + s03 + "-");
		System.out.println("substring(2) : " + "-" + s04 + "-");
		System.out.println("substring(2,6) : " + "-" + s05 + "-");
		System.out.println("replace (B, a) : " + "-" + s06 + "-");
		System.out.println("replace (ABC, String) : " + "-" + s07 + "-");
		System.out.println("indexOf : " + "-" + i + "-");
		System.out.println("lastIndexOf : " + "-" + j + "-");

	}

}
