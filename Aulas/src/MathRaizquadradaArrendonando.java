
public class MathRaizquadradaArrendonando {

	public static void main(String[] args) {
		/* Calcular a raiz quadrada de um n�mero real e apresentar o resultado 
		 * com arredondamentos utilizando a classe Math */
		
		// Defini��o de um n�mero real
		double num = 90;
		
		/*Ca�lculo e reprsenta��o da raiz quedrada de um n�mero real utilizando a classe Math
		 * */
		System.out.println("sqrt: Raiz quadrad de "+ num + " = " + Math.sqrt(num));
		
		/*Calculo da raiz quadrada de um n�mero real com arrendondamento utilizando a classe Math*/
		System.out.println("round: O valor arrendondado da raiz quadrada de "+ num + " = " + Math.round(Math.sqrt(num)));
		
		
		

	}

}
