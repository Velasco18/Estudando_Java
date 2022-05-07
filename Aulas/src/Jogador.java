
public class Jogador {
	
	private int numero;
	private String nome;
	
	public int getNumero() {  // método para mudar o valor da variável número
		return numero;
	}

	public void setNumero(int numero) { // método para mudar o valor da variável número
		this.numero = numero;
	}

	public String getNome() {  // método para pegar o valor da variável nome
		return nome;
	}

	public void setNome(String nome) { // método para mudar o valor da variável nome
		this.nome = nome;
	}

	public static void main(String[] args) {
		
		Jogador jogador = new Jogador(); // Criação  do objeto
		jogador.setNumero(10);
		jogador.setNome("Pelé");
		
		System.out.println("O " + jogador.getNome() + " foi um dos melhores camisa " + 
		jogador.getNumero() + " de todos os tempos");
		
		
	}

}
