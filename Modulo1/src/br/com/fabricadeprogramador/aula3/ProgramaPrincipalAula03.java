package br.com.fabricadeprogramador.aula3;

import java.util.Scanner;

import br.com.fabricadeprogramador.aula2.Calculadora;

public class ProgramaPrincipalAula03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		Calculadora calc = new Calculadora();
		/*System.out.println("Digite um n�mero:");
		boolean r = calc.ehPar(leitor.nextInt());
		System.out.println(r);
		
		*/
		
		System.out.println("Digite A:");
		Double a = leitor.nextDouble();
		System.out.println("Digite B:");
		Double b = leitor.nextDouble();
		System.out.println("Opera��o (1=Soma, 2=Subtra��o, 3=Divis�o, 4=Multiplica��o)");
		Integer op = leitor.nextInt();
		
		Double r = calc.calcular(a, b, op);
		System.out.println("Calculo :" +r);
		
		
		leitor.close(); 

	}

}
