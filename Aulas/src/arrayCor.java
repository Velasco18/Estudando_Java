import java.util.Arrays;

public class arrayCor {

	public static void main(String[] args) {
		String [] cores = new String [5];
		cores[0] = "Azul";
		cores[1] = "Verde";
		cores[2] = "Verde";
		cores[3] = "Vermelho";
		cores[4] = "Branco";
		
		Arrays.sort(cores);
		
		for(String valor: cores) {
			System.out.println(valor+"\t");
		}

	}

}
