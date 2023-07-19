import java.util.Scanner;

public class MmComum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int resultado;		
		
		System.out.println("Digite o 1° número:");		
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o 2° número:");		
		int numero2 = sc.nextInt();
		
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("São múltiplos");						
		} 
		else
			{
			System.out.println("Não são múltiplos");
		}
				 
		sc.close();

	}
}