package br.com.fabricadeprogramador.aula7;

import java.util.Scanner;

public class ProgramaPrincipalMatriz {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double notas[][] = new double[2][2];
		// Entradas
		for(int linha=0; linha<notas.length; linha++) {
			for(int coluna=0; coluna<2; coluna++) {
				System.out.println("Nota["+ linha +"]["+coluna+ "]:");
				notas[linha][coluna] = leitor.nextDouble();
			}
			
		}
		//Saida
		for(int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<2; coluna++) {
				System.out.println("Nota["+linha+"]["+coluna+"]=" + notas[linha][coluna]);
			}
		}
		leitor.close();
	}


}