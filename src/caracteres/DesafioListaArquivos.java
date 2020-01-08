package caracteres;

import java.util.regex.*;

public class DesafioListaArquivos {
	public static void main(String[] args) {
		String texto = "lista de arquivos mp3: jazz.mp3,rock.mp3,podcast.mp3,blues.mp3";
		String regex = "\\.mp3";
		// no futuro...
		regex = "\\w+\\.mp3";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
				
		while(matcher.find()) {
			System.out.printf("%s %s%n", matcher.start(), matcher.group());
		}
	}
}
