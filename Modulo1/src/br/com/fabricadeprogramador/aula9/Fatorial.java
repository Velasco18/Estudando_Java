package br.com.fabricadeprogramador.aula9;


public class Fatorial {
	
	public int calcularFatorial(int n) { //n � numero que se quer saber seu fatorial
		if(n == 0) {
			return 1;
		}
		
		return n* calcularFatorial(n-1); //calculo do fatorial que � multiplica��o dos seu antecessores
		
	}

}
