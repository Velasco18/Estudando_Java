package heranca;

public class Gato extends Animal{
	
	public void Gato() {
		this.setTipo("mam�feros");
	}
	
	@Override
	public void som() {
		System.out.println("Miau");
	}

}
