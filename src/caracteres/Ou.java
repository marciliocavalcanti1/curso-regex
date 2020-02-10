package caracteres;

import java.util.regex.*;

public class Ou {
	
	private static final String texto = "Voc� precisa responder sim, n�o ou n�o sei!";
	private static final String regex = "sim|n.o|sei"; // alternativa (OU)

	public static void main(String[] args) {
		
				
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
				
		while(matcher.find()) {
			System.out.printf("%s %s%n", matcher.start(), matcher.group());
		}
	}

}
