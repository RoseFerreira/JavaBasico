import java.util.Scanner;

public class Condicao_If_Else {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para o dia da semana:");
		int x = sc.nextInt();
		String dia;
		
		if (x == 1) {
			dia = "Domingo";
		} else if (x == 2) {
			dia = "Degunda-Feira";
		} else if (x == 3) {
			dia = "Terca-Feira";
		} else if (x == 4) {
			dia = "Quarta-Feira";
		} else if (x == 5) {
			dia = "Quinta-Feira";
		} else if (x == 6) {
			dia = "Sexta-Feira, Uhuuuuuuuuuul!!";
		} else if (x == 7) {
			dia = "Qabado";
		} else {
			dia = "valor invalido";
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}
