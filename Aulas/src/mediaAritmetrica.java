import java.util.Scanner;

public class mediaAritmetrica {

	public static void main(String[] args) {
		double nota1, nota2, nota3, mediaAritmetrica, mediaPonderada;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite primeira nota: ");
		nota1 = ler.nextFloat();
		
		System.out.println("Digite segunda nota: ");
		nota2 = nota1 = ler.nextFloat();
		
		System.out.println("Digite terceira nota: ");
		nota3 = nota1 = ler.nextFloat();
		
		// A média Aritmétrica é calculada pela soma das notas, dividido
		// pelo numero de notas.
		// A media Ponderada  é caulculada multiplicando as nota com o peso que ela tém 
		//e dividido pela soma dos pesos
		mediaAritmetrica = (nota1 + nota2 +nota3)/3;
		mediaPonderada = ((nota1*3) + (nota2*3) +(nota3*4))/10;
	System.out.println("A média aritmétrica é: " + mediaAritmetrica);
	System.out.println("A média ponderada é: " + mediaPonderada);
	}

}
