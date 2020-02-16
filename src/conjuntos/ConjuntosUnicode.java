package conjuntos;

import java.util.regex.*;

public class ConjuntosUnicode {

	private static final String TEXTO = "áéíóú àèìòù âêîôû ç ãõ ü";
	private static String error = "";
	
	public static void main(String[] args) {
		
		String regex	= "[À-ü]";

		try {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(TEXTO);
			
			while(matcher.find()) {
				System.out.printf("Índice: %s Valor: %s%n", matcher.start(), matcher.group());
			}
		} catch (Exception e) {
			error = e.getMessage();
			System.err.println(error);
		}
	}
}