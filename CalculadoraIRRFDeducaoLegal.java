import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIRRFDeducaoLegal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Salário Tributável de IRRF");
		double salariobruto = sc.nextDouble();
		double irrf;

		
		if (salariobruto <= 2112.00) {
			System.out.println("Isento de IRRF");	
						
		} if (salariobruto >= 2112.01 && salariobruto <= 2826.65) {
			irrf = ((salariobruto * 7.5)/ 100) - 158.40;
			System.out.println("Entra na faixa de 7,5%");
			System.out.printf("O Valor do IRRF pela dedução Legal é = R$ %.2f", irrf);	
			
		} if (salariobruto >= 2826.66 && salariobruto <= 3751.05) {
			irrf = ((salariobruto * 15)/ 100) - 370.40;
			System.out.println("Entra na faixa dea 15%");
			System.out.printf("O Valor do IRRF pela dedução Legal é = R$ %.2f", irrf);
			
		} if (salariobruto >= 3751.06 && salariobruto <= 4664.68) {
			irrf = ((salariobruto * 22.5)/ 100) - 651.73;
		    System.out.println("Entra na faixa de 22.5%");
		    System.out.printf("O Valor do IRRF pela dedução Legal é = R$ %.2f", irrf);
		    
		} if (salariobruto >= 4664.69 ) {
			irrf = ((salariobruto * 27.5)/ 100) - 884.96;
			System.out.println("Entra na faixa de 27.5%");
			System.out.printf("O Valor do IRRF pela dedução Legal é = R$ %.2f", irrf);
			
		    Locale.setDefault(Locale.US);
			
		}
		 
		sc.close();

	}
}