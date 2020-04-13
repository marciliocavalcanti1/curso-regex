package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexCompiler {

	public static void regexComp(String regex, String texto) {

		try {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(texto);

			while (matcher.find()) {
				System.out.printf("Índice: %s Valor: %s%n", matcher.start(), matcher.group());
			}
		} catch (Exception e) {
			String error = e.getMessage();
			System.err.println(error);
		}
	}
}
