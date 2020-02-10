package caracteres;

import java.util.regex.*;

public class ProblemaPonto {
	
	private static final String texto = "Bom\ndia";
	private static final String regex = "(?i)(?s)."; // flag (?s) resolve o problema do ponto. conceito chamado dotall
//	private static final String regex = "(?i)...."; // o ponto não engloba o \n
	private static String error = "";
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		try {
			while(matcher.find()) {
				System.out.printf("%s %s%n", matcher.start(), matcher.group());
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
			error = e.getMessage();
		}
	}

}
