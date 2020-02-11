package conjuntos;

import java.util.regex.*;

public class Intervalos {

	private static final String TEXTO = "1,2,3,4,5,6,a.b c!d?e[f";
	@SuppressWarnings("unused")
	private static String error = "";
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[a-z]");
		pattern = Pattern.compile("[b-d]");
		pattern = Pattern.compile("[2-4]");
		pattern = Pattern.compile("(?i)[A-Z1-3]");
		Matcher matcher = pattern.matcher(TEXTO);

		try {
			while(matcher.find()) {
				System.out.printf("Índice: %s Valor: %s%n", matcher.start(), matcher.group());
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
			error = e.getMessage();
		}
	}

}