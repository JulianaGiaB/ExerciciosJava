import java.util.Scanner;

public class imposto_de_renda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valordosalario, faixa1, faixa2, faixa3, faixa4;

		double  resultadofaixa2, resultadofaixa3, resultadofaixa4;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor do seu salario: ");
		valordosalario = sc.nextDouble();
		
		resultadofaixa2 = valordosalario - 2000.00;
		resultadofaixa3 = valordosalario - 3000.00;
		resultadofaixa4 = valordosalario - 4500.00;
		
		faixa1 = 0.00;
		faixa2 = resultadofaixa2 * 0.08;
		faixa3 = (resultadofaixa3 * 0.18) + ((valordosalario - resultadofaixa3 - 2000.00) * 0.08);
		faixa4 = (resultadofaixa4 * 0.28) + (( valordosalario- resultadofaixa4 - 3000.00)* 0.18) + (1000.00 * 0.08); 

		if (valordosalario <= 2000) {
			System.out.println("Está isento de pagamento.");
		} else if (valordosalario > 2000.00 && valordosalario <= 3000.00) {
			System.out.println("O Valor do imposto que devera pagar é de R$ " + faixa2 + " reais.");
		}
		else if (valordosalario > 3000.00 && valordosalario <= 4500.00) {
			System.out.println("O Valor do imposto que devera pagar é de R$ " + faixa3 + " reais.");
		}
		else { System.out.println("O Valor do imposto que devera pagar é de R$ " + faixa4 + " reais.");
		}
	}
}
