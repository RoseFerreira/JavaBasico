import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá Mundo!!");  
		System.out.println("Bom dia!");
		int y = 32;		
		System.out.println(y);	
		double x = 10.35784;
		System.out.printf("%.2f%n", x);
		//%.2fn quer dizer que estou formatando para duas casas decimais "f" formatando, "2" duas casas decimais com quebra de linha (%.2fn)
		System.out.printf("%.4f%n", x);
		//%.2fn quer dizer que estou formatando para duas casas decimais "f" formatando, "4" duas casas decimais (%.2fn)
	    
		// Nesse exemplo, foi alterado o ponto para vírgula, para alterar de vírgula para ponto, basta inserir o comando abaixo
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		//Para concatenar usando o + +		
		System.out.println("RESULTADO = " + x + " METROS");
        
		//Para concatenar usando a formatação %2.f
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		//NOVO TESTE
		
		String nome = "Maria";
	    int idade = 31;
	    double renda = 4000.0;
	    System.out.printf("%s tem %d e ganha R$ %.2f Reais%n", nome, idade, renda); 
	    // %s é para textos
	    // %d é para inteiros
	    // %n é para quebra de linha
	    // %f ponto flutuante
		
	}
	

}
