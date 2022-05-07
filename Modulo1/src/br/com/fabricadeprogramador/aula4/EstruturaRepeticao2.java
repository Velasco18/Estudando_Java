package br.com.fabricadeprogramador.aula4;

import java.util.Scanner;

public class EstruturaRepeticao2 {

	public static void main(String[] args) {

//		for(int i = 0; i<10; i=i+1) {
//			System.out.println("Oi " + (i+1));
//		}
		
		double n1, n2, n3, media; // Declaração
		
		Scanner leitor = new Scanner(System.in);
		//Entradas
		
		System.out.println("N1:");
		n1 = leitor.nextDouble();
		
		System.out.println("N2:");
		n2 = leitor.nextDouble();
		
		System.out.println("N3:");
		n3 = leitor.nextDouble();
		
		//Processamneto
		media = (n1+n2+n3) /3;
		
		//Saida
		System.out.println("Media:" + media);
		

	}

}
