import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("escolha uma opção: \n 1 - para saque \n 2 - para deposito \n 3- para saldo");
        int opcao = dados.nextInt();

        double saldo = 500;

        switch (opcao) {
            case 1:
            System.out.println("insira o valor do saque: ");
            Double saque = dados.nextDouble();
            Double novoSaldo = saldo - saque;
            saldo=novoSaldo;
            System.out.println("o valor sacado foi: "+ saque);
            System.out.println("seu saldo é: " + novoSaldo);
                break;

            case 2:
                System.out.println("insira o valor de deposito: ");
                double deposito = dados.nextDouble();
                novoSaldo = saldo + deposito;
                saldo=novoSaldo;
                System.out.println("o valor depositado foi: " + deposito);
                System.out.println("seu saldo é: " + novoSaldo);
                break;
        
                case 3:
                System.out.println("seu saldo é: " + saldo);
                break;
            default:
                break;
        }
    }
}
