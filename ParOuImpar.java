import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para saber se é par ou ímpar:");
		
		int numero = sc.nextInt();
				
		if (numero % 2 == 0) {
			System.out.println("É par");						
		} 
		else
			{
			System.out.println("É ímpar");
		}
				 
		sc.close();

	}
}
