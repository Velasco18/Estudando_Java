
public class Jogador {
	
	private int numero;
	private String nome;
	
	public int getNumero() {  // m�todo para mudar o valor da vari�vel n�mero
		return numero;
	}

	public void setNumero(int numero) { // m�todo para mudar o valor da vari�vel n�mero
		this.numero = numero;
	}

	public String getNome() {  // m�todo para pegar o valor da vari�vel nome
		return nome;
	}

	public void setNome(String nome) { // m�todo para mudar o valor da vari�vel nome
		this.nome = nome;
	}

	public static void main(String[] args) {
		
		Jogador jogador = new Jogador(); // Cria��o  do objeto
		jogador.setNumero(10);
		jogador.setNome("Pel�");
		
		System.out.println("O " + jogador.getNome() + " foi um dos melhores camisa " + 
		jogador.getNumero() + " de todos os tempos");
		
		
	}

}
