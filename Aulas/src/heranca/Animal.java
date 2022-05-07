package heranca;

public class Animal {
	
	private String tipo;
	private String nome;
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String tipo) {
		this.nome = tipo;
	}
	
	public void som() {
		System.out.println("Miau");
	}
	
	

}
