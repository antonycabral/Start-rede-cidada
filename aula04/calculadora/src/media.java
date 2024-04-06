import java.util.Scanner;

public class media {
    

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        int quantidade = 0;
        int soma = 0;
        int idade;

        while (true) {
            System.out.print("Digite a idade do indivíduo ou um valor negativo para sair: ");
            idade = dados.nextInt();

            if (idade <= 0) {
                if (quantidade == 0) {
                    System.out.println("Impossível calcular a média.");
                } else {
                    double media = (double) soma / quantidade;
                    System.out.printf("A média das idades é: %.2f%n", media);
                }
                break;
            }

            soma += idade;
            quantidade++;
        }

        dados.close();
    }
}

