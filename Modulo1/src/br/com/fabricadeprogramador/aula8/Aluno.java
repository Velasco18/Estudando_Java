package br.com.fabricadeprogramador.aula8;

import java.util.Iterator;

public class Aluno {
	double notas[][] = new double[2][2];
	int linha = 0;
	int coluna = 0;
	int numeroEntradas = 0;

	public void adicioarNotas(double nota) {
		if (linha < notas.length) {
			notas[linha][coluna] = nota;

		}
		if (coluna < notas[0].length) {
			coluna++;
		}
		if (coluna == notas[0].length) {
			linha++;
			coluna = 0;
		}
	}

	public void limparNotas() {
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[0].length; j++) {
				notas[i][j] = -1;

			}
		}
	}

	public double buscarNota(int pos) {
		int qtdColunas = notas[0].length; // Saber a quantidade de colunas pelas quantidade de notas
		int qtdLinhas = notas[0].length;
		int tamanho = qtdColunas * qtdLinhas;
		if (pos > 0 && pos <= tamanho) {
			int linha = pos / qtdColunas; // Descoberta da Linha
			if (pos % qtdColunas == 0) {
				linha--;
			}

			int coluna = pos - (qtdColunas * linha) - 1; // Descoberta da coluna

			return notas[linha][coluna];
		}
		else {
			return -1;
		}
	}
}
