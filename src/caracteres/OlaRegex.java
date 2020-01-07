package caracteres;

import java.util.regex.*;

public class OlaRegex {

	public static void main(String[] args) {

		String texto = "Casa bonita é casa amarela da esquina com a Rua ACASALAR.";
		String regex = "(?i)casa bonita*";
		regex = "[a]";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println(texto.matches(regex));
		
		
		try {
			
			while (matcher.find()) {
			
				System.out.print(matcher.group() + " ");
			
			}
			
		} catch (Exception e) {
			
			System.out.println("Exception: " + e.getMessage());

		}
		
	}

}
