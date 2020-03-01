package quantificadores;

import java.util.regex.*;

public class ZeroMais {

	private static final String TEXTO = "De longe eu avistei o fogo e uma pessoa gritando: FOGOOOOOO!";
	private static final String TEXTO_DOIS = "There is a big fog in NYC";
	private static String error = "";
	
	public static void main(String[] args) {
		
		// * -> zero ou mais
		String regex = "(?i)fogo*";
		regex = "(?i)fogo*?"; // não guloso

		try {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(TEXTO);
//			Matcher matcher = pattern.matcher(TEXTO_DOIS);
			
			while(matcher.find()) {
				System.out.printf("Índice: %s Valor: %s%n", matcher.start(), matcher.group());
			}
		} catch (Exception e) {
			error = e.getMessage();
			System.err.println(error);
		}
	}
}