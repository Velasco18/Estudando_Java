
public class forFormas {

	public static void main(String[] args) {
		// Foma 1:Valor inicial declarado externamente
		System.out.println("--------------------------------------");
		System.out.println("  ");
		System.out.println("Forma 1: Valor inicial para x = 10 declarado externamente");
		
			int x = 10; // Valor inicial declarado
			for (; x <= 20; x++) { // condicional não aplicada
			System.out.println("Intervalo aleatório e fraccionario para x entre 10 e 20: " + Math.random());
		}
			
		// Forma 2: condicional controlada por if x>25
		System.out.println("-------------------------------------");
		System.out.println("  ");
		System.out.println(" Forma 2: condicional controlada no final do loop por if x>25");
			for (x = 25;; x++) { // condional aplicada por if
			System.out.println(" Intervalo aleatório e fraccionario para x entre 20 e 25:" + Math.random());
			if (x > 25)
				break; // condional aplicada por if

		}
		// Forma 3: incremento controlado no acululador de comando x++
		System.out.println("----------------------------------------");
		System.out.println("  ");
		System.out.println("Forma 3: Incremento controlado no acumulador de comando x++");
			for (x = 1; x <= 10;) { // incremento não aplicado
			System.out.println(" Intervalo aleatório e fraccionario para x entre 1 e 10: " + Math.random());
			x++; // incremento controlado por acumulador

		}
		// Forma 4: aninhamento de for para os acumuladores x e y
		System.out.println("-----------------------------------------");
		System.out.println("  ");
		System.out.println("Forma 4: aninhamento de for para os acumuladores x e y");
			int y = 1; // valor-inicial declado para y
			for (x = 1; x <= 10; x++) { // aninhamento de laços - valor-inicial declarado internamente para x

			for (; y <= 5; y++) { // valor-inicial declarado externamente para y no inicio da forma 4

				System.out.println("Valor incremnetado de 1 em 1 para y entre 1 e 5: " + y);
			}
			System.out.println("Intervalo aleatório e fraccionario para x entre 1 e 10: " + Math.random() * x);

		}
		// Forma 5: decremento de 5 em 5
		System.out.println("------------------------------------------------");
		System.out.println("  ");
		System.out.println("Forma 5: decremento de 5 em 5 para x");
			for (x = 50; x >= 5; x -= 5) {

			System.out.println("Valor decrescente de 5 em 5 para x  entre 50 e 5: " + x);

		}

	}

}
