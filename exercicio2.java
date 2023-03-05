import java.util.Scanner;

public class exercicio2 {


			    public static void main(String[] args) {
			    Scanner scanner = new Scanner(System.in);
					
			    	int codePeca, nPeca;
					float valorUni, valor1, valor2, total;
					
					System.out.println ("Informe o código da peça: ");
					codePeca = scanner.nextInt();
					System.out.println ("Informe a quantidade de peças: ");
					nPeca = scanner.nextInt();
					System.out.println ("Informe o valor unitário da peça: ");
					valorUni = scanner. nextFloat();
					valor1 = (nPeca * valorUni);
					
					System.out.println ("Informe o código da peça2: ");
					codePeca = scanner.nextInt();
					System.out.println ("Informe a quantidade de peças2: ");
					nPeca = scanner.nextInt();
					System.out.println ("Informe o valor unitário da peça2: ");
					valorUni = scanner. nextFloat();
					valor2 = (nPeca * valorUni);
					
					total= (valor1 + valor2);
					System.out.println("valor a pagar: "+ total);
			    }
			}