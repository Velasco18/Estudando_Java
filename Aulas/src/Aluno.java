
public class Aluno {
	
	private String nome;
	private int matricula;
	private String turno;
	private int semestre = 1;
	private int faltas = 0;

	// Criando contrutores
	
	public Aluno(int numeroMatricula) { //Construtor que recebe um atributo
		this.matricula = numeroMatricula;
		System.out.println("Novo aluno - matricula " + this.matricula);
	}
	
	public Aluno(String nomeAluno, int numeroMatricula) { //Construtor que recebedois atributos.
		this.nome = nomeAluno;
		this.matricula = numeroMatricula;
		System.out.println("Novo aluno - nome: " +this.nome+" - matricula: "+ this.matricula);
	}
	
	
	
	
	// Método proximoSemestre obtém a variável privada semestre e retorna somando um
	public int proximoSemestre() {
		return this.semestre + 1;

	}

	// Método quantidadeDeFaltas retornao valor da variável privada faltas
	public int quantidadeDeFaltas() {
		return this.faltas;
	}

	public double calcularMediaProvas(double nota1, double nota2, double nota3) {
		return (nota1 + nota2 + nota3) / 3;

	}

}