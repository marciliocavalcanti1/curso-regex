package cursoRegex;

import java.util.regex.*;
import org.apache.log4j.Logger;

public class Program {
	
	private static final Logger LOGGER = Logger.getLogger(Program.class);
	
	public static void main(String[] args) {
		
		String texto = "0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f";
		Pattern patternLetras = Pattern.compile("[a-f]");
		Matcher matcher = patternLetras.matcher(texto);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}

//		while (matcher.find()) {
//			LOGGER.info(String.format("Posicoes: %s, %s \tValor: %s%n",
//					matcher.start(), matcher.end(), matcher.group()));
//		}
//		
//		LOGGER.info(texto.replaceAll("[7-9]", "Achei"));
//		
	}
}
