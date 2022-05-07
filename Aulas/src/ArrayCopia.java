
public class ArrayCopia {

	public static void main(String[] args) {
		
		// Array unidimenssional NOMECURSO com tamanho de 7 elementos [0] a [6]
		char[] NOMECURSO = {'S', 'I', 'S', 'T', 'E', 'M', 'A','D', 'I','N','F','O','R','M','A','C','A','O'};
		
		// Array unidimenssional CODCURSO com tamanho de 4 elementos [0] a [3]
		char[] CODCURSO = new char[4];
		
		//Transferencia do conteúdo entre os arrays utilizando o metodo arraycopy
		System.arraycopy(NOMECURSO, 0, CODCURSO, 0, 4);
		
		
		System.out.println(new String(CODCURSO));
		
		
		

	}

}
