package br.com.fabricadeprogramador.aula7;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		Loja lojinhaDaMaria = new Loja();

		System.out.println("Qtd de Clientes:");
		int qtd = leitor.nextInt();
		lojinhaDaMaria.setQuantidadeClientes(qtd);

		// Cadastro
		for (int i = 0; i < qtd; i++) {
			Cliente cli = new Cliente();
			System.out.println("Nome");
			cli.nome = leitor.next();
			System.out.println("Sexo:");
			cli.sexo = leitor.next().toLowerCase().charAt(0);
			System.out.println("Idade:");
			cli.idade = leitor.nextInt();

			lojinhaDaMaria.adicionarCliente(cli);

		}
		System.out.println("1-Imprimir Todos, 2-Imprimir Mulheres, 3-Imprimir Homens");
		int opcao = leitor.nextInt();
		if (opcao == 1) {
			lojinhaDaMaria.imprimirTodos();
		} else if (opcao == 2) {
			lojinhaDaMaria.imprimirClientesMulheres();
		} else if (opcao == 3) {
			lojinhaDaMaria.imprimirClientesHomens();

		}
		leitor.close();

	}

}
