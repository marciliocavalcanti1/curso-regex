package quantificadores;

import utils.regexCompiler;

public class UsandoChaves {
	
	public static void main(String[] args) {
		
		String texto = "O Jo�o recebeu 120 milh�es apostando 6 9 21 23 45 46.";
		
		// para definir uma quantificador usa {}
		String regex = "\\d{1,2}";
		regex = "[0-9]{2}";
		regex = "\\d{1,}";
		// com palavras
		regex = "\\w{7}";
		regex = "[\\w�]{7,}";
		// no futuro, utilizando bordas
		regex = "\\b\\d{1,2}\\b";
		regex = "\\b[\\w�]{7}\\b";
		
		regexCompiler.regexComp(regex, texto);
	}
}
