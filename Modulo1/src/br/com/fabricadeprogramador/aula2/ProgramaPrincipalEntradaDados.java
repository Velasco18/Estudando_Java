package br.com.fabricadeprogramador.aula2;

import java.util.Scanner;

public class ProgramaPrincipalEntradaDados {

	public static void main(String[] args) {
		
		//Entrada e Saida de dados pelo teclado
		//A classe Scanner permite que o usuario digite os dados
		Scanner leitor = new Scanner(System.in);
		
		//Saida
		System.out.println("Nome:");
		
		//Entrada
		String textoDigitado = leitor.next();
		
		//Saida
		System.out.println("Você Digitou:" + textoDigitado.toUpperCase());
		
		Calculadora calc = new Calculadora();
		
		System.out.println("Digite n1:");
		double n1 = leitor.nextInt();//Leitura(entrada)
		
		System.out.println("Digite n2:");
		double n2 = leitor.nextInt();// Leitira(entrada)
		
		double s = calc.Somar(n1, n2); //Calculo(processamento)
		
		System.out.println("A soma é: " + s); //Impressaõ(saida)
		
		//Encerramento do objeto(O Sanner exige o seu encerramento)
		leitor.close();
		
		
		


	}

}
