package caracteres;

import java.util.regex.*;

public class Metacaracteres {
	public static void main(String[] args) {
		// . ? * + - ^ $ | [ ] { } ( ) \ :
		String texto = "1,2,3,4,5,6,a.b c!d?e";
		// Metacaractere "Escape": Quero utilizar um metacaractere de forma literal
		// Por exemplo o metacaractere ".", neste exemplo quero utiliza-lo de forma literal
		String regexPonto = "\\.";
		String regexSimbolos = ",|\\.|\\?|!| ";
		String[] regexArray = texto.split(regexPonto);
		
		for (String string : regexArray) {
			System.out.println(string);
		}
		
		System.out.println("===========");
		
		Pattern pattern = Pattern.compile(regexPonto);
		Matcher matcher = pattern.matcher(texto);
		
		while(matcher.find()) {
			System.out.printf("%s %s%n", matcher.start(), matcher.group());
		}
		
		System.out.println("===========");
		
		regexArray = texto.split(regexSimbolos);

		for (String string : regexArray) {
			System.out.print(string + " ");
		}
		
		System.out.println("\n===========");
		
		pattern = Pattern.compile(regexSimbolos);
		matcher = pattern.matcher(texto);

		while(matcher.find()) {
			System.out.printf("%s %s%n", matcher.start(), matcher.group());
		}
	}
}
