package conjuntos;

import java.util.regex.*;

public class Conjuntos {

	private static final String TEXTO = "1,2,3,4,5,6,a.b c!d?e[f";
	private static final String REGEX_PARES = "[02468]";

	private static final String TEXTO_DOIS = "João não vai passear na moto.";
	private static final String REGEX_COM_E_SEM_ACENTO = "n[aã].";
	
	@SuppressWarnings("unused")
	private static String error = "";
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile(REGEX_PARES);
		Matcher matcher = pattern.matcher(TEXTO);
		
		pattern = Pattern.compile(REGEX_COM_E_SEM_ACENTO);
		matcher = pattern.matcher(TEXTO_DOIS);
				
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
