
public class arrayFuncionario {

	public static void main(String[] args) {
		String [] [] nome = new String [2] [2];
			nome[0][0] = "Adriana";
			nome[0][1] = "Fernanda";
			nome[1][0] = "Leticia";
			nome[1][1] = "Gustavo";

			
			for(int l= 0; 1<nome.length;l++) {
				for(int c=0; c<nome[l].length; c++) {
					System.out.println(l+ " e "+ "+ c + = "+nome[l][c]+"\t");
					
				}
				System.out.println("\n");
				
			}

	}

}
