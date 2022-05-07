package br.com.fabricadeprogramador.aula7;

public class Loja {
	private Cliente clientes[];
	int numeroEntradas = 0;

	public void adicionarCliente(Cliente novoCliente) {
		if (numeroEntradas < clientes.length) {
			clientes[numeroEntradas] = novoCliente;
			numeroEntradas ++;
		}
	}

	public void imprimirTodos() {
		for (int i =0; i < clientes.length; i++) {
			System.out.println(clientes[i].nome + " " +clientes[i].sexo + " " +clientes[i].idade);
		}
	}

	public void setQuantidadeClientes(int qtd) {
		clientes = new Cliente[qtd];

	}

	public void imprimirClientesMulheres() {
		for(int i =0; i<clientes.length; i++) {
			if(clientes[i].sexo=='f') {
				System.out.println(clientes[i].nome);
			}

		}

	}

	public void imprimirClientesHomens() {
		for (int i = 0; i<clientes.length; i++) {
			if (clientes[i].sexo == 'm') {
				System.out.println(clientes[i].nome);

			}

		}
	}
}