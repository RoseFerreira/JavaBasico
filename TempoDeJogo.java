import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int totalHoras;
				
		System.out.println("Digite a hora de início do Jogo:");		
		int horaInicio = sc.nextInt();
		
		System.out.println("Digite a hora final do Jogo:");		
		int horaFinal = sc.nextInt();
		
		if (horaInicio < horaFinal) {
			totalHoras = horaFinal - horaInicio;
		}
		else {
			totalHoras = 24 - horaInicio + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + totalHoras + " HORA(S)");
		
		sc.close();
	}
}