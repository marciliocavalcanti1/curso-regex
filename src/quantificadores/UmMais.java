package quantificadores;

import java.util.regex.*;

public class UmMais {

	private static final String TEXTO = "De longe eu avistei o fogo e uma pessoa gritando: FOGOOOOOO!";
	private static final String TEXTO_DOIS = "There is a big fog in NYC";
	private static final String TEXTO_TRES = "Os números: 0123456789.";
	private static String error = "";
	
	public static void main(String[] args) {
		
		// + -> um ou mais
		String regex	= "(?i)fogo+";
		regex 			= "[0-9]";
		regex			= "\\d+"; // utilizando shorthand

		try {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(TEXTO);
			matcher = pattern.matcher(TEXTO_DOIS);
			matcher = pattern.matcher(TEXTO_TRES);
			
			while(matcher.find()) {
				System.out.printf("Índice: %s Valor: %s%n", matcher.start(), matcher.group());
			}
		} catch (Exception e) {
			error = e.getMessage();
			System.err.println(error);
		}
	}
}