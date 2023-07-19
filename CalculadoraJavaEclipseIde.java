import java.util.Scanner;

public class CalculadoraJavaEclipseIde {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Escolha a operação: ");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        
        int operator = scanner.nextInt();
        
        int result = 0;
        String operation = "";
        
        switch (operator) {
            case 1:
                result = num1 + num2;
                operation = "adição";
                break;
            case 2:
                result = num1 - num2;
                operation = "subtração";
                break;
            case 3:
                result = num1 * num2;
                operation = "multiplicação";
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    operation = "divisão";
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }
        
        System.out.println("O resultado da " + operation + " é: " + result);
        
        scanner.close();
    }
}