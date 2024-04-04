import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] args) {
        
        double resultado;
        
        Scanner dados = new Scanner(System.in);

        System.out.println("insira o numero desejado para operação:");
        double op = dados.nextDouble();

        System.out.println("insira o primeiro numero: ");
        double num1 = dados.nextDouble();

        System.out.println("insira o segundo numero: ");
        double num2 = dados.nextDouble();

        switch (op) {
            case (double) 1:
                resultado = num1 + num2;
                break;
            case (double) 2:
                resultado = num1 - num2;
                break;
            case (double) 3:
                resultado = num1 * num2;
                break;
            case (double) 4:
                resultado = num1 / num2;
            default:
                break;
        }
    }
}
