import java.util.Scanner;

public class sextaAula {

	public static void main(String[] args) {
	 float altura;
	 float peso;
	 
	 Scanner leitor = new Scanner(System.in);
	 
	 System.out.println("Qual a sua altura?");
	  altura = leitor.nextFloat();
	  
	  System.out.println("Qual � o seu peso?");
	  peso = leitor.nextFloat();
	  
	  
	  System.out.println(" A minha altura �:" + altura +  "e peso: "+ peso +"kg");
	  leitor.close();

	}
	

}
