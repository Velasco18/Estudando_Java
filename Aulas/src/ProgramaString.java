
public class ProgramaString {

	public static void main(String[] args) {

		System.out.println("\n** Recomenda - se não acentuar as apalavras! **");
		System.out.println("\n=================================================");
		String v1 = "Sistema";
		String v2 = new String("sistema");

//equal
		System.out.println("Exemplo com o metodo de comparação: equals");
		if (v1.equals(v2)) {
			System.out.println("Variaveis Identicas => " + "v1: " + v1 + " v2: " + v2);
		}

		else {
			System.out.println("Variaveis Diferentes => " + "v1: " + v1 + " v2: " + v2);

		}

		System.out.println("\n===================================================");
//equalsIgnoreCase
		System.out.println("Exepmlo Sem o metodo de comparação: equalsIgnoreCase");
		if (v1.equalsIgnoreCase(v2)) {
			System.out.println("Variaveis Identicas =>" + " v1: " + v1 + " v2: " + v2);
		}

		else {
			System.out.println("Variaveis Diferentes=>" + " v1: " + v1 + " v2: " + v2);

		}
		System.out.println("\n==================================================");
//Algusn metodos
//indexOf, charAt, substring
		System.out.println("Exemplos com metodos: indexOf, substring, charAt");
		String frase = "Desenvolvimento de Sistemas";
		System.out.println("\nFrase-Exemplo => Desenvolvimento de Sistemas");
		System.out.println(
				"\nindexOf => Posicao da fonte <a> na Frase-Exemplo (0 a 26 e com os espaços): " + frase.charAt(5));

		System.out.println("\n====================================================");
//concat
		String titulo1 = "Desenvolvimento ", titulo2 = "de Sistemas ";
		String cursoCompleto = titulo1.concat(titulo2);
		System.out.println("\ntitulo 1: " + titulo1);
		System.out.println("titulo 2: " + titulo2);
		System.out.println("Exemplo concatenado => titulo1 + titulo2 = " + cursoCompleto);
	}

}
