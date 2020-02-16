package conjuntos;

import java.util.regex.*;

public class ConjuntosNegados {

//	private static final String TEXTO = "1,2,3,a.b c!d?e[f";
	private static final String TEXTO_DOIS = "1: !\"#$%&\'()*+,-./ 2: :;<=>?@";
	private static String error = "";
	
	public static void main(String[] args) {
		
		String regex	= "\\D";
		regex			= "[^0-9]";
		regex			= "[^\\d]";
		regex			= "[^\\d!\\?\\[\\s,\\.]";
		
		regex			= "[^!-/:-@\\s]"; // dois intervalos
		
		try {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(TEXTO_DOIS);
			
			while(matcher.find()) {
				System.out.printf("Índice: %s Valor: %s%n", matcher.start(), matcher.group());
			}
		} catch (Exception e) {
			error = e.getMessage();
			System.err.println(error);
		}
	}
}