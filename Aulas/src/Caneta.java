
public class Caneta {
	
	String marca;// Variavel destinada ao nome do fabricante
	boolean tinta; // variavel destinada a marcaççao se a caneta possui tinta ou não
	String corTinta; // Variavel destinada a cor da tinta
	
	
	public Caneta() { // Método construtor que define alguns valores padrão.
		marca = "Pilot";
		tinta = true;
		corTinta = "Azul";
	}//Observe que o método foi declarado com o mesmo nome da classe, 
	//o que indica ao compilador Java que queremos que ele seja um construtor.

}
