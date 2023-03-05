import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor de A:");
		a = sc.nextInt();

		System.out.println("Informe o valor de B:");
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("São múltiplos!");
		} else {
			System.out.println("Não são múltiplos!");
		}
		sc.close();

	}

}