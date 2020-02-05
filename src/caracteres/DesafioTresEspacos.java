package caracteres;

import java.util.regex.*;

public class DesafioTresEspacos {
	public static void main(String[] args) {
		String texto = "a   b";
		String regex = "a\\s\\s\\sb";
		// no futuro...
		regex = "a\\s+b";
		regex = "a {3}b";
		regex = "a\\s{3}b";
		Pattern patternLetras = Pattern.compile(regex);
		Matcher matcher = patternLetras.matcher(texto);

		while (matcher.find() ) {
			System.out.printf("Posicoes: %s, %s	\tValor: %s%n", matcher.start(), matcher.end(), matcher.group());
		}
	}
}
