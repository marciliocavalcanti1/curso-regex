package conjuntos;

import java.util.regex.*;

public class Shorthands {

	private static final String TEXTO = "1,2,3,4,5,6,a.b c!d?e\r\f	-\nf_g";
	private static String error = "";
	
	public static void main(String[] args) {
		
		String regex	= "\\d"; // números [0-9]
		regex			= "\\D"; // não números [^0-9] (conjunto negado)
		regex			= "\\w"; // caracteres [a-zA-Z0-9_]
		regex			= "\\W"; // não caracteres [^a-zA-Z0-9_] (conjunto negado)
		regex			= "\\s"; // espaço [ \t\n\r\f]
		regex			= "\\S"; // não espaço [^ \t\n\r\f] (conjunto negado)
		
		// \b \B (Bordas de palavras)
		
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