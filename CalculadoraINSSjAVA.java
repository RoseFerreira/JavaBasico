
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraINSSjAVA {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Salário Tributável de INSS");
		double salariobruto = sc.nextDouble();
		double inss;

		
		if (salariobruto <= 1320.00) {
			inss = (salariobruto * 7.5)/ 100;
			System.out.println("Entra na faixa de 7.5%");	
			System.out.printf("O Valor do INSS é = R$ %.2f", inss);
			
		} if (salariobruto >= 1320.01 && salariobruto <= 2571.29) {
			inss = ((salariobruto * 9)/ 100) - 19.80;
			System.out.println("Entra na faixa de 9%");
			System.out.printf("O Valor do INSS é = R$ %.2f", inss);	
			
		} if (salariobruto >= 2571.30 && salariobruto <= 3856.94) {
			inss = ((salariobruto * 12)/ 100) - 96.95;
			System.out.println("Entra na faixa de 12%");
			System.out.printf("O Valor do INSS é = R$ %.2f", inss);
			
		} if (salariobruto >= 3856.95 && salariobruto <= 7507.49) {
		    inss = ((salariobruto * 14)/ 100) - 174.10;
		    System.out.println("Entra na faixa de 14%");
		    System.out.printf("O Valor do INSS é = R$ %.2f", inss);
		    
		} if (salariobruto >= 7507.50 ) {
			inss = 876.95;
			System.out.println("Teto do INSS");
			System.out.printf("O Valor do INSS é = R$ %.2f", inss);
			
		    Locale.setDefault(Locale.US);
			
		}
		 
		sc.close();

	}
}