package heranca;

public class Sapo extends Animal{ //Herdando as caracter�sticasda classe Animal.  
	
	public void Sapo() {
		this.setTipo("anf�bio");
	}
	
	@Override //Sobrescrevendo o m�todo som.
	public void som() {
		System.out.println("Frog!");
	}

}
