package exerciciosAula03;

public class TesteFiguraGeometrica {

	public static void main(String[] args) {

		FiguraGeometrica fg = new FiguraGeometrica();
		String triangulo = fg.identificarTriangulo(3, 3, 4);
		System.out.println("Tipo de triangulo:" + triangulo);
		

	}

}
