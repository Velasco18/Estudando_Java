
public class TratamentoExcecaoTryCatchFinally {

	public static void main(String[] args) {
		System.out.println("Rodando o Sistema");
		
		Aluno[] alunos = new Aluno[50];
		
		int indice = 74;
		
		// tratamento de exce��es
		try {
			// tenta executar esse comando
			System.out.println(alunos[indice]); // Tenta exectar o comando caso ocorra uma exce��o
			//ser� encaminhado para o catch
		}catch(ArrayIndexOutOfBoundsException erro) {
			//se houve algum erro no bloco anterior
			//esse comando ser� executado
			System.out.println("Aluno inexistente");	
		}catch(Exception erro) {
			// pode -se usar um catch para cada tipo de erro
			//possivel no bloco try
			
			System.out.println("exce��o inesperada");// Ser� executado sempre que haver uma exce��o
		} finally {
			//esse comando ser� executado sempre
			System.out.println("executou o fanally");
		}

	}

}
