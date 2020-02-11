package caracteres;

import java.util.regex.*;

public class Unicode {
	
	// https://unicode-table.com/pt/
	
	private static final String TEXTO = "aʬc௵d";
	private static final String REGEX = "\\u02AC|\\u0BF5";
	@SuppressWarnings("unused")
	private static String error = "";
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(TEXTO);
				
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
