package br.com.fabricadeprogramador.aula5;

import java.util.Scanner;

import br.com.fabricadeprogramador.aula2.Calculadora;

public class ProgramaPrincipalMaiorIdadeMaiorMenorMedia {
	
	public static void main(String[] args) {
		
		//Leitor
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qtd Numeros: ");
		int qtd = leitor.nextInt();
		
		//Processamento
		Calculadora calc = new Calculadora();
		calc.maiorMenorMedia(qtd);
		
		leitor.close();
	}
}
