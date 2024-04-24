import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nome;
        int conta = 1;
        double saldo = 500;

        Scanner dados = new Scanner(System.in);

        System.out.println("insira o que deseja fazer: \n 1- para criar conta \n 2- para fazer deposito \n 3- para " +
                "sacar");
        int opcao = dados.nextInt();

        if (opcao == 1) {
            dados.nextLine();
            System.out.println("insira seu nome: ");
            nome = dados.nextLine();
            conta = conta + 1;
            System.out.println(conta);
        } else if (opcao == 2) {
            System.out.println("insira o valor do deposito: ");
            double deposito = dados.nextDouble();
            double saldoT = saldo + deposito;
            System.out.println(saldoT);
            saldo = saldoT;
        } else if (opcao == 3) {
            System.out.println("insira o valor para sacar: ");
            double saque = dados.nextDouble();
            double vSaque = saldo - saque;
            System.out.println(vSaque);
            saldo = vSaque;
        }

        System.out.printf("sua conta é %d, seu saldo é %.2f", conta,saldo);
    }
}