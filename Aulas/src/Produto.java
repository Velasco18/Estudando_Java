
public class Produto {
	
	
	private int contador = 0;
	public String nome;
	public int quantidade;
	
	public static void main(String[] args) {
		

	}
	public void exibir() {
		contador++;
		System.out.println(this.nome+ "::"+this.quantidade);
	}

}
