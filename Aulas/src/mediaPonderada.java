import java.util.Scanner;

public class mediaPonderada {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite Primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite Segunda nota: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Digite Terceira nota: ");
		nota3 = ler.nextDouble();
		
		// A media Ponderada  é achado multiplicando a nota com o peso que ela tem 
		//e dividida pela soma dos pesos
		media = ((nota1*3) + (nota2*3) +(nota3*4))/10;
		System.out.println("A média Ponderada é: " + media);

	}

}
