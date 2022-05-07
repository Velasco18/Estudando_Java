
public class TratamentoExcecaoTryCatchFinally {

	public static void main(String[] args) {
		System.out.println("Rodando o Sistema");
		
		Aluno[] alunos = new Aluno[50];
		
		int indice = 74;
		
		// tratamento de exceções
		try {
			// tenta executar esse comando
			System.out.println(alunos[indice]); // Tenta exectar o comando caso ocorra uma exceção
			//será encaminhado para o catch
		}catch(ArrayIndexOutOfBoundsException erro) {
			//se houve algum erro no bloco anterior
			//esse comando será executado
			System.out.println("Aluno inexistente");	
		}catch(Exception erro) {
			// pode -se usar um catch para cada tipo de erro
			//possivel no bloco try
			
			System.out.println("exceção inesperada");// Será executado sempre que haver uma exceção
		} finally {
			//esse comando será executado sempre
			System.out.println("executou o fanally");
		}

	}

}
