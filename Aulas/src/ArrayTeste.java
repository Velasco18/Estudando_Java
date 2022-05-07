
public class ArrayTeste {

	public static void main(String[] args) {
		String[] cursos;
		cursos = new String[2];
		cursos[0] = "Sistemas";
		cursos[1] = "Internet";

		// Array multidimensional para aarmazenasmento das 4 notas de cada disciplina

		double[][] notas = new double[2][4];
		notas[0][0] = 8.0;
		notas[0][1] = 7.5;
		notas[0][2] = 9.0;
		notas[0][3] = 8.5;
		notas[1][0] = 9.5;
		notas[1][1] = 8.5;
		notas[1][2] = 8.0;
		notas[1][3] = 9.0;

//PROCESSAMETO DE DADOS		

		double media = 0.0;
		System.out.println("\n");
		System.out.println("MEDIAS:");

		// Controle de busca por disciplina através da variavel L
		for (int l = 0; l < notas.length; l++) {

			// Controle de busca por disciplina através

			for (int c = 0; c < notas[l].length; c++) {
				// Acomulador das 4 notas de cada disciplina da variavel media
				media = media + notas[l][c];

			}
			// Calculo aritmetrico da variavel media acumulada por disciplina
			media = media / 4;

			// SAIDA DE DADOS
			// Apresentação do resultado apos o processamento com catenação de string e
			// variaveis
			System.out.println(cursos[l] + " = " + media);
			media = 0;
			
					}

			System.out.println("\n");

	}

}
