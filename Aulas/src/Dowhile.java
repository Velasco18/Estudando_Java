
public class Dowhile {

	public static void main(String[] args) {
		// O  programa executar� 10 vezes o trecho do...while, 
		//inicializando com 10 (long d=10) e executando at� 20 (d <=20)
		
//		long d = 10;
//		
//		do {
//			System.out.println(d++);
//		}
//		while(d <= 20);
		
		//Inicialmente, a estrutra do..hile imprimir� uma mensagem concoatenada com
		// um valor aleat�rio, o valor ser� multiplicado  pela variave r, incrementado de 1(r++)
		//e o controle condicional ser� aplicado para contuidade ou n�o do la�o do..while 
		//enquanto  r<=10
		
//		int r = 0;
//		
//		do {
//			System.out.println("Valor Aleat�rio (randomico) : " + Math.random()*r);
//			
//			r++;
//		}
//		while (r <= 10);
//			System.out.println("Total acumulado: " + r);
		
		String nome = "Sensei";
		int i = 0;
		
		do {
			System.out.println("Nome dele � :" + nome);
			i++;
		}
		
		while(i <=10);
		
		System.out.println("Total de vezes: " + i);
		

	}
	

}
