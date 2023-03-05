import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc = new Scanner(System.in);
		double a,b,c;
    	double pi = 3.14159;
    	double areaTriangulo = 0.0;
    	double areaCirculo = 0.0;
    	double areaTrapezio = 0.0;
    	double areaQuadrado = 0.0;
    	double areaRetangulo = 0.0;
    			
		System.out.println("Digite os valores de A, B e C: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		sc.close();
		
		areaTriangulo = (a * c)/2;
		areaCirculo = (c*c) * pi;
		areaTrapezio = ((a + b)*c)/2;
		areaQuadrado = b*b;
		areaRetangulo = a*b;
		
		System.out.printf("a)Àrea Triângulo: %.3f%n"
				+ "b)Àrea Circulo: %.3f%n"
				+ "c)Àrea Trapézio: %.3f%n"
				+ "d)Àrea Quadrado: %.3f%n"
				+ "e)Àrea Retângulo: %.3f%n",
				areaTriangulo, areaCirculo,areaTrapezio, areaQuadrado, areaRetangulo);
	}

}
