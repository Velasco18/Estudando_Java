package br.com.fabricadeprogramador.aula5;

import java.util.Scanner;

public class ProgramaPrincipalMaiorOuIgual {
	/**
	 Fa�a um programa que leia 2 numeros inteiros e imprima qual 
	 � o maior entre eles ou se s�o iguais.
	  */

	public static void main(String[] args) {
		int n1, n2, maior;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o n1");
		n1 = leitor.nextInt();
		
		System.out.println("Digite o n2");
		n2 = leitor.nextInt();
		
		if(n1 > n2) {
			maior = n1;
			System.out.println("Maior numero �:" + maior);
			
		}
		else if(n1 <n2) {
			maior = n2;
			System.out.println("Maior numero �:" + maior);
		}
		else {
			
		System.out.println("S�o iguais");
		}
		leitor.close();

	}

}
