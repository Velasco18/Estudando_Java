
public class switchCompostoExemplo {

	public static void main(String[] args) {
		
		String resultado = "";
		
		int valor = 11;
		switch (valor) {
		
		case 12:
			resultado = "Excelnte";
			break;
		
		case 11:
			resultado = "Otimo";
			break;
			
		case 10:
			resultado = "Muito Bom";
			break;
			
		case 9:
			resultado = "Bom";
			break;
			
		case 8:
			resultado = "Satisfatório";
			break;
			
		case 7:
			resultado = "Baixo";
			break;
			
		case 6:
			resultado = "Muito Baixo";
			break;
			
		default:
			resultado = "Insatisfatório";
			break;
			
		}
		
		System.out.println("Resultado Km/1: " + valor + " = " + resultado);

	}

}
