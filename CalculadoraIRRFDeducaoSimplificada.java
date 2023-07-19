import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIRRFDeducaoSimplificada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Salário Tributável de IRRF");
		double salariobruto = sc.nextDouble();
		double irrf;
		double irrf1;

		
		if (salariobruto <= 2112.00) {
			System.out.println("Isento de IRRF");	
						
		} if (salariobruto >= 2112.01 && salariobruto <= 2826.65) {
			irrf1 = (salariobruto - 528.00);
			irrf = ((irrf1 * 7.5) / 100) - 158.40;
			System.out.println("Entra na faixa de 7,5%");
			System.out.printf("O Valor do IRRF pela dedução Simplificada é = R$ %.2f", irrf);	
			
		} if (salariobruto >= 2826.66 && salariobruto <= 3751.05) {
			irrf1 = (salariobruto - 528.00);
			irrf = ((irrf1 * 15) / 100) - 370.40;
			System.out.println("Entra na faixa de 15%");
			System.out.printf("O Valor do IRRF pela dedução Simplificada é = R$ %.2f", irrf);
			
		} if (salariobruto >= 3751.06 && salariobruto <= 4664.68) {
			irrf1 = (salariobruto - 528.00);
			irrf = ((irrf1 * 22.5) / 100) - 651.73;
		    System.out.println("Entra na faixa de 22.5%");
		    System.out.printf("O Valor do IRRF pela dedução Simplificada é = R$ %.2f", irrf);
		    
		} if (salariobruto >= 4664.69 ) {
			irrf1 = (salariobruto - 528.00);
			irrf = ((irrf1 * 27.5) / 100) - 884.96;
			System.out.println("Entra na faixa de 27.5%");
			System.out.printf("O Valor do IRRF pela dedução Simplificada é = R$ %.2f", irrf);
			
		    Locale.setDefault(Locale.US);
			
		}
		 
		sc.close();

	}
}