import java.util.Scanner;// Inicio import Scann

public class SomaDeValores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		

		System.out.println("Soma = " + soma);
		
		sc.close();// Fim import Scann
		
	}

}