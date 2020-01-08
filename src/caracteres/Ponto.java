package caracteres;

import java.util.regex.*;

public class Ponto {
	public static void main(String[] args) {
		/* 
		 * Ponto (.) � um coringa, v�lido em 
		 * apenas uma posi��o (dentro da regex).
		 */
		String texto = "1,2,3,4,5,6,7,8,9,0";
		/*
		 * Ele ir� procurar o que tem entre 1 e o 2.
		 */
		String regex = "1.2";
		/*
		 * N�o retornar� nada, pq n�o existem 
		 * dois caracteres entre 1 e o 2.
		 */
		regex = "1..2";
		regex = "1..,";
		/*
		 * Notas de aluno.
		 */
		texto = "8.3,7.1,8.8,10.0";
		regex = "8..";
		regex = ".\\..";
		
		Pattern patternLetras = Pattern.compile(regex);
		Matcher matcher = patternLetras.matcher(texto);

		while (matcher.find() ) {
			System.out.printf("Posicoes: %s, %s	\tValor: %s%n", matcher.start(), matcher.end(), matcher.group());
		}
	}
}
