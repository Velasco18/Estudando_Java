package br.com.fabricadeprogramador.aula5;

import java.util.Scanner;

public class ProgramaPrincipalMaior10_2 {
	/**
	 Faça um programa que leia 10 numeros inteiros e imprima qual 
	 é o maior e o menor entre eles.
	  */

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n;
		int maior=0;
		int menor =0;
		
		//Loop de 10 vezes
		for(int i=0; i<10 ; i=i+1) {
			
			System.out.println("Digite N"+(i+1)+":");
			n = leitor.nextInt();
			
			//É o primeior número
			if(i==0) {
				maior = n;
				menor = n;
				
			}
			if(n>maior) {
				maior = n;
			}
			if(n<=menor) {
				menor = n;
				
			}
			
		}
		System.out.println("Maior:"+ maior + " Menor: "+ menor);
		leitor.close();
	}
}
