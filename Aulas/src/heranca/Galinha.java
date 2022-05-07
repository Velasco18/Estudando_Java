package heranca;

public class Galinha extends Animal{
	
	
	public void Galinha() {
		this.setTipo("Aves");
		
	
	}
	@Override // Sobrescrevendo o método som
	public void som() {
		System.out.println("Cocoricó");
	}

}
