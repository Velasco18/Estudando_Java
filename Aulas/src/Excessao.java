
public class Excessao {

	public static void main(String[] args) {
		
		//A aplicação a seguir irá tentar acessar um indice inexistente no array alunos,
		//causando uma exceção
				
		System.out.println("Rodando o Sitema");

		Aluno[] alunos = new Aluno[50]; // Definindo um array com, no máximo, 50 alunos.

		System.out.println(alunos[74]); // Acessando um elemento fora do limite definido.

	}

}
