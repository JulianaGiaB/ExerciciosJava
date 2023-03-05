import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horaInicial, horaFinal, duracao = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a hora incial: ");
		horaInicial = sc.nextInt();

		System.out.println("Informe a hora final: ");
		horaFinal = sc.nextInt();

		if (horaInicial > horaFinal) {
			duracao = 24 - (horaInicial - horaFinal);
		} else {
			duracao = horaFinal - horaInicial;
		}

		System.out.println(duracao +" horas.");

		sc.close();

	}

}
