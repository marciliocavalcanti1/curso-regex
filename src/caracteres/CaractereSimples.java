package caracteres;

import java.util.regex.*;

public class CaractereSimples {

	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,a.b c!d?e";
		String regexVirgula = "[,]";
		String regex = "(?i)[A]";
		String regexNumero = "[2]";
		String regexMaior = "[b c!d]";
		String[] textoArray = texto.split(regexVirgula);
		int count = 0;

//		for (String string : textoArray) {
//			System.out.printf("Indice:%s \tValor:%s%n", count, string);
//			count++;
//		}
		
		Pattern patternLetras = Pattern.compile(regexMaior);
		Matcher matcher = patternLetras.matcher(texto);

		while (matcher.find() ) {
			System.out.printf("Posicoes: %s, %s	\tValor: %s%n", matcher.start(), matcher.end(), matcher.group());
		}
	}
}
