
public class Dowhile {

	public static void main(String[] args) {
		// O  programa executará 10 vezes o trecho do...while, 
		//inicializando com 10 (long d=10) e executando até 20 (d <=20)
		
//		long d = 10;
//		
//		do {
//			System.out.println(d++);
//		}
//		while(d <= 20);
		
		//Inicialmente, a estrutra do..hile imprimirá uma mensagem concoatenada com
		// um valor aleatório, o valor será multiplicado  pela variave r, incrementado de 1(r++)
		//e o controle condicional será aplicado para contuidade ou não do laço do..while 
		//enquanto  r<=10
		
//		int r = 0;
//		
//		do {
//			System.out.println("Valor Aleatório (randomico) : " + Math.random()*r);
//			
//			r++;
//		}
//		while (r <= 10);
//			System.out.println("Total acumulado: " + r);
		
		String nome = "Sensei";
		int i = 0;
		
		do {
			System.out.println("Nome dele é :" + nome);
			i++;
		}
		
		while(i <=10);
		
		System.out.println("Total de vezes: " + i);
		

	}
	

}
