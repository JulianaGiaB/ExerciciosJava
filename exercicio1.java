import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		float n1, n2, resultado = 0;

		System.out.println("Escreva dois valores para somar:");
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();

		resultado = n1 + n2;

		System.out.println(resultado);

	}

}
