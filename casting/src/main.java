import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

    /* System.out.println("digite sua idade");
        int idade = dados.nextInt();

        System.out.println("digite sua altura");
        double altura = dados.nextDouble();

        System.out.println("sua idade é: " + idade + "sua altura é: " + altura);*/

        char x;
        System.out.println("digita ai");
        x = dados.next().charAt(0);

        System.out.println(x);

        dados.close();
    }
}
