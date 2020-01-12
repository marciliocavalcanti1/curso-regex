package caracteres;

import java.util.regex.*;

public class Brancos {
	public static void main(String[] args) {
		String texto = ""
				+ "\nca\tr"
				+ "\nr\to s!"
				+ "\n";
		String regex = "(?m)ca\t";
		
		Pattern patternLetras = Pattern.compile(regex);
		Matcher matcher = patternLetras.matcher(texto);

		while (matcher.find() ) {
			System.out.printf("Posicoes: %s, %s	\tValor: %s%n", matcher.start(), matcher.end(), matcher.group());
		}
	}
}
