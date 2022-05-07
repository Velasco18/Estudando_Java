
public class forModel {

	public static void main(String[] args) {
//		for(int x =1; x <=5 ; x+=1) {
//			System.out.println("x="+x);
//		}
		
		//Elabora um programa no qual o sistema deveria
		//fornecer 10 números inteiros aleatórios e, ao final, exibir a soma desses números.
			int numero;
			int soma = 0;
			
			for(int i = 0; i <10; i++) {
				numero = (int) (Math.random() *100);
				soma += numero;
				
			}
			System.out.println("Resultado da dsoma: " +soma);
	}

}
