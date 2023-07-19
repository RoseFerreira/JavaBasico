import java.util.Scanner;


public class CalculoSalarioHora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double valorHora;
		
		System.out.println("Digite o valor do Salário mensal: ");
		double SalarioMes = sc.nextDouble();
		
		System.out.println("Digite o número de Horas Trabalhadas no mês: ");
		double numHoras = sc.nextDouble();
		
		valorHora = SalarioMes / numHoras;	
		System.out.printf("O valor do salário hora é: %.2f", valorHora);
				
		
		sc.close();
	}

}

