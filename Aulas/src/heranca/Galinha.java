package heranca;

public class Galinha extends Animal{
	
	
	public void Galinha() {
		this.setTipo("Aves");
		
	
	}
	@Override // Sobrescrevendo o m�todo som
	public void som() {
		System.out.println("Cocoric�");
	}

}
