
public class TratandoExcessoes {

	public static void main(String[] args) {
		System.out.println("Rodando o Sistemas");
		
		Aluno[] alunos = new Aluno[50];
		
		int indice = 74; // Definido o valor do indice que vamos acessar
		
		if(indice >= 0 && indice < 50) { // Validando o indice para não ocorra nenhuma exceção
			System.out.println(alunos[indice]);
			
		}
		else {
			System.out.println("Aluno não existente!");
		}

	}

}
