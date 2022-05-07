package br.com.fabricadeprogramador.aula2;

public class ProgramaPrincipalAula2 {

	public static void main(String[] args) {
		
		//Declaração
		Cliente c1, c2, c3;
		
		//Instanciação
		c1 = new Cliente();
		c1.nome = "Jão";
		c1.rg = "0008281 SSP/MS";
		c1.cpf = "90909909";
		c1.altura = 1.75;
		c1.peso = 70.0;
		c1.ativado = true;
		c1.estadoCivil = EstadoCivil.CASADO;
		c1.sexo = Sexo.MASCULINO;
		
		
		c2 = new Cliente();
		c2.nome = "Aquiles";
		c2.rg = "10101000";
		c2.cpf = "00088808";
		c2.altura = 1.70;
		c2.peso = 80.0;
		c2.ativado = true;
		
		c3 = new Cliente();
		c3.nome = "Kobe Bryant";
		c3.rg = "24242424242 FILADELFIA/EUA";
		c3.cpf = "88888888";
		c3.altura = 1.98;
		c3.peso = 90.0;
		c3.ativado = false;
		
		
		//Declara e Instancia
		Cliente c4 = new Cliente();
		
		//Instanciando Calculadora
		
		Double n1 = 10.00;
		Double n2 = 3.00;
		Calculadora calc = new Calculadora();
		
		double soma = calc.Somar(n1, n2);
		System.out.println("Soma:" + soma);
		
		double sub = calc.Subtrair(n1, n2);
		System.out.println("Subtração:" + sub);
		
		double mult = calc.Multiplicar(n1, n2);
		System.out.println("Multiplicação:" + mult);
		
		double div = calc.Dividir(n1, n2);
		System.out.println("Divisão:" + div);
		
		double resto = calc.RestoDivisao(n1, n2);
		System.out.println("Resto da Divisão:" + resto);
		
		
		//Estudando Metodos
		String nome = new String("Osvaldo");
		int tamanho = nome.length(); //Pega o tamanho da String
		char letra = nome.charAt(0); // Pega a posição da letra
		boolean vazio = nome.isEmpty(); // Verifica se a string está vazia
		System.out.println(tamanho);

	}

}
