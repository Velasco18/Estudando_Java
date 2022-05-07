package br.com.fabricadeprogramador.aula5;

import java.util.Scanner;

public class ProgramaPrincipalMaior3 {
	/**
	 Faça um programa que leia 3 numeros inteiros e imprima qual 
	 é o maior entre eles.
	  */

	public static void main(String[] args) {
		int n1, n2, n3, maior, menor;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o n1");
		n1 = leitor.nextInt();
		
		System.out.println("Digite o n2");
		n2 = leitor.nextInt();
		

		System.out.println("Digite o n3");
		n3 = leitor.nextInt();
		
		
		// Maior número
		if(n1 > n2 && n1 > n3) {
			maior = n1;
			System.out.println("Maior numero é o:" + maior);
			
		}
		else if(n2> n1 && n2 > n3) {
			maior = n2;
			
		}
		else {
			maior = n3;
			
			
		}
		
		// Menor numero
		if(n1 < n2 && n1 < n3) {
			 menor = n1;
			
		}
		else if(n2< n1 && n2 < n3) {
			 menor = n2;
			
		}
		else {
			 menor = n3;
			
			System.out.println("Menor:" + menor + "Maior: " + maior);
		leitor.close();

		}
	}
}
