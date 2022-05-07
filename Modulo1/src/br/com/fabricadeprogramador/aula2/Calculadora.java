package br.com.fabricadeprogramador.aula2;

import java.util.Scanner;

public class Calculadora {

	Double Somar(Double n1, Double n2) {
		return n1 + n2;
	}

	Double Subtrair(Double n1, Double n2) {
		return n1-n2;
	}

	Double Multiplicar(Double n1, Double n2) {
		return n1 * n2;

	}

	public Double Dividir(Double n1, Double n2) {
		Double divisao = null;
		if (n1 > 0 && n2 > 0) {
			divisao = n1 / n2;

		}
		return divisao;
	}

	Double RestoDivisao(Double n1, Double n2) {

		return n1 % n2;
	}

	public boolean ehPar(int n) {
		if (n % 2 == 0) {
			return true;

		} else {
			return false;
		}
	}
	/**
	 * Calcula as operações aritmetricas básicas de soma subtração, dividsão e Muliplicação
	 * @param n1 primeiro numero da operação
	 * @param n2 segundo numero da operação
	 * @param operacao 1-Soma , 2- Subtrair, 3- Dividir, 4- Multiplicar
	 * @return resultado da operação
	 * */

	public Double calcular(Double n1, Double n2, Integer operacao) {
		Double calculo = null;

		if (operacao == 1) {
			calculo = Somar(n1, n2);

		} else {

			if (operacao == 2) {
				calculo = Subtrair(n2, n2);

			} else {

				if (operacao == 3) {
					calculo = Dividir(n1, n2);

				} else {
					calculo = Multiplicar(n1, n2);
				}
			}

		}

		return calculo;

	}

	public void maiorMenor(int qtd) {

		Scanner leitor = new Scanner(System.in);
		int n;
		int maior = 0;
		int menor = 0;

		// Loop de qtd de vezes
		for (int i = 0; i < qtd; i = i + 1) {

			System.out.println("Digite N" + (i + 1) + ":");
			n = leitor.nextInt();

			// É o primeiro número
			if (i == 0) {
				maior = n;
				menor = n;

			}
			if (n > maior) {
				maior = n;
			}
			if (n <= menor) {
				menor = n;

			}

		}
		leitor.close();
	
	}
	//Metodo para calcular a idade e imorimir a maior idade a menor idade e a media entre elas
	public void maiorMenorMedia(int qtd) {

		Scanner leitor = new Scanner(System.in);
		int idade;
		int maior = 0;
		int menor = 0;
		int soma = 0;
		double media;

		// Loop de qtd de vezes
		for (int i = 0; i < qtd; i = i + 1) {

			System.out.println("Digite Idade" + (i + 1) + ":");
			idade = leitor.nextInt();

			// Acomulador
			soma = soma + idade;

			// É o primeiro número
			if (i == 0) {
				maior = idade;
				menor = idade;

			}
			if (idade > maior) {
				maior = idade;
			}
			if (idade <= menor) {
				menor = idade;

			}

		}
		
		media = soma / qtd;
		System.out.println("Maior:" + maior + " Menor: " + menor + " Media: " + media);
		leitor.close();
	}

	public void multOperacoes() {
		Scanner leitor = new Scanner(System.in);
		int sair;
		
		
		do {
			
			System.out.println("N1: ");
			Double n1 = leitor.nextDouble();
			System.out.println("N2: ");
			Double n2 = leitor.nextDouble();
			System.out.println("1-Soma, 2-Subtrair, 3-Dividir, 4-Multiplicar");
			Integer operacao = leitor.nextInt();
			
			double res = calcular(n1, n2, operacao);
			System.out.println("Resultado:" + res);
			
			System.out.println("Deseja Fazer Nova Operação? 0-Sair, 1-Continuar");
			sair = leitor.nextInt();
			
			
		}while(sair!=0);
		System.out.println("Programa Encerrado!");
		
		leitor.close();

		
	}

}
