package heranca;

public class Sapo extends Animal{ //Herdando as característicasda classe Animal.  
	
	public void Sapo() {
		this.setTipo("anfíbio");
	}
	
	@Override //Sobrescrevendo o método som.
	public void som() {
		System.out.println("Frog!");
	}

}
