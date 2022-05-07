
public class exercicios {

	public static void main(String[] args) {
		//String msg = "Mundo!";
		//System.out.println("Olá " + msg);
		// fim do codigo hello Mundo!
		
		//int idade	 = 65;
		//if(idade >= 65) {
			//System.out.println("Melhor idade!");
		
// Fim do codigo idade
		
			/*String status;
			int media = 5;
			if(media >= 6) {
				
				status ="Aprovado";
			}else {
				status = "Reprovado";
			}
			System.out.println(media);
			System.out.println(status);
				
			}*/
			
		//}

	//}
		
//		int idade = 18;
//		String categoria;
//		
//		System.out.println("Teste Categoria");
//		
//		if(idade <= 16) {
//			categoria = "Infantil";
//			
//		}else if(idade < 18) {
//			categoria = "Juvenil";
//		}
//		else {
//			categoria = "adulto";
//		}
//	
//	System.out.println(categoria);
	
		// Fim c´digo de status
		
		String curso = "DS"; 
		int turma = 0;
		
		// Operador E é verdadeiro sse os dois forem verdadeiro
		if(curso == "DS" && turma!= 0) {
			System.out.println("Olá Mundo!");
		}
		
		// Operador OU é verdadeiro se apenas um for verdadeiro
		if(curso == "S" || turma == 1) {
			System.out.println("Olá Mundoo!");
			
		}
		// Negação nega a condição do Operador
		if(!(curso == "DS")) {
			System.out.println("Olá Mundooo");
		}
		else {
			System.out.println("Informação não disponivel! ");
		}
	}
}
