package br.com.fabricadeprogramador.aula5;

import java.util.Scanner;

public class ProgramaPrincipalMaior3_2 {
	/**
	 * Faça um programa que leia 3 numeros inteiros e imprima qual é o maior entre
	 * eles.
	 */

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o n1");
		int n1 = leitor.nextInt();

		System.out.println("Digite o n2");
		int n2 = leitor.nextInt();

		System.out.println("Digite o n3");
		int n3 = leitor.nextInt();

		int maior;
		int menor;

		// Maior número
		if (n3 > n2 && n3 > n1) {
			maior = n3;

			if (n2 > n1) {
				menor = n2;

			} else {
				menor = n1;
			}

		} else if (n2 > n1 && n2 > n3) {
			maior = n2;
			if (n1 < n3) {
				menor = n1;
			} else {
				menor = n3;
			}
		} else {
			maior = n1;
			if (n2 < n3) {
				menor = n2;
			} else {
				menor = n3;
			}

		}

		System.out.println("Menor: "+ menor + " Maior: " + maior);
		leitor.close();
	}
}
