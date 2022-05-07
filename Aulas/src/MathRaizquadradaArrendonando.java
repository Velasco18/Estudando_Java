
public class MathRaizquadradaArrendonando {

	public static void main(String[] args) {
		/* Calcular a raiz quadrada de um número real e apresentar o resultado 
		 * com arredondamentos utilizando a classe Math */
		
		// Definição de um número real
		double num = 90;
		
		/*Caçlculo e reprsentação da raiz quedrada de um número real utilizando a classe Math
		 * */
		System.out.println("sqrt: Raiz quadrad de "+ num + " = " + Math.sqrt(num));
		
		/*Calculo da raiz quadrada de um número real com arrendondamento utilizando a classe Math*/
		System.out.println("round: O valor arrendondado da raiz quadrada de "+ num + " = " + Math.round(Math.sqrt(num)));
		
		
		

	}

}
