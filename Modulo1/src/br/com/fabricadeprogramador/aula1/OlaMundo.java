package br.com.fabricadeprogramador.aula1;

public class OlaMundo {

	public static void main(String[] args) {
		
		System.out.println("");
		
		//Instancia de Carro
		Carro carro1 = new Carro();// Criando copia da ficha em branco/objeto
		carro1.ano = 1981; // preenchendo os campos da ficha
		carro1.cor = "Azul";
		carro1.marca = "Wolkswagen";
		carro1.modelo = "Fusca";
		 
		Carro carro2 = new Carro(); // Criando mais uma copia da ficha em branco/objeto
		carro2.ano = 2015; //preenchendo os campos da ficha
		carro2.cor = "Branco";
		carro2.marca = "Chevrolet";
		carro2.modelo = "Cobalt";
		
		
		System.out.println("ANO:"+ carro1.ano + " COR:" + carro1.cor + " MARCA:" + carro1.marca + " MODELO:" + carro1.modelo);
		System.out.println("ANO:" + carro2.ano + " COR:" + carro2.cor + " MARCA:" + carro2.marca + " MODELO:" + carro2.modelo);
		

	}

}
