package br.com.fabricadeprogramador.aula8;

public class ProgramaPrincipalMatrizes {

	public static void main(String[] args) {
		
		//Estanciando a classe Aluno
		Aluno aluno = new Aluno();
		aluno.limparNotas();
		
		aluno.adicioarNotas(10); //[0,0] - posi??o 1
		aluno.adicioarNotas(8.5); //[0,1] - posi??o 2
		aluno.adicioarNotas(9.7); //[1,0] - posi??o 3
		aluno.adicioarNotas(6.5); //[1,1] - posi??o 4
		
		double notaBuscada = aluno.buscarNota(0);
		System.out.println(notaBuscada);

	}

}
