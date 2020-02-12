package conjuntos;

import java.util.regex.*;

public class IntervalosCuidados {

	private static final String TEXTO = "ABC [abc] a-c 1234";
	@SuppressWarnings("unused")
	private static String error = "";
	
	public static void main(String[] args) {
		
		String regex	= "[a-c]";
		regex 			= "a-c"; // não é um intervalo, está trazendo os valores literais
		regex			= "[A-z]"; // intervalos usam a ordem da tabela UNICODE
		regex			= "[a-zA-Z]";
		
		// tem que respeitar a ordem da tabela UNICODE
		regex			= "[a-Z]";
		regex			= "[4-1]";
	
		try {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(TEXTO);
			
			while(matcher.find()) {
				System.out.printf("Índice: %s Valor: %s%n", matcher.start(), matcher.group());
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
			error = e.getMessage();
			System.err.println(error);
		} catch (PatternSyntaxException e) {
			error = e.getMessage();
			System.err.println(error);
		}
	}

}