package conjuntos;

import java.util.regex.*;

public class ConjuntosComMetacaracteres {

	private static final String TEXTO = ".$+*?-";
	@SuppressWarnings("unused")
	private static String error = "";
	
	public static void main(String[] args) {
		
		String regex = "[+.?*$]";
		regex = "[+.?*$].";
		regex = "[$-?]"; // isso é um intervalo (range)
		
		// NÃO é um intervalo (range)...
		regex = "[$\\-?]";
		regex = "[-?]";
				
		Pattern pattern = Pattern.compile(regex);
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