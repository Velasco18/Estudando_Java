
public class Caneta {
	
	String marca;// Variavel destinada ao nome do fabricante
	boolean tinta; // variavel destinada a marca��ao se a caneta possui tinta ou n�o
	String corTinta; // Variavel destinada a cor da tinta
	
	
	public Caneta() { // M�todo construtor que define alguns valores padr�o.
		marca = "Pilot";
		tinta = true;
		corTinta = "Azul";
	}//Observe que o m�todo foi declarado com o mesmo nome da classe, 
	//o que indica ao compilador Java que queremos que ele seja um construtor.

}
