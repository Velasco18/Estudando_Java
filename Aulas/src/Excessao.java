
public class Excessao {

	public static void main(String[] args) {
		
		//A aplica��o a seguir ir� tentar acessar um indice inexistente no array alunos,
		//causando uma exce��o
				
		System.out.println("Rodando o Sitema");

		Aluno[] alunos = new Aluno[50]; // Definindo um array com, no m�ximo, 50 alunos.

		System.out.println(alunos[74]); // Acessando um elemento fora do limite definido.

	}

}
