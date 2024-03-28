import java.util.Scanner;

public class atividade {
    
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

        System.out.println("insira a largura do terreno: ");
        double largura = dados.nextDouble();
        System.out.println("digite o comprimento do terreno: ");
        double comprimento = dados.nextDouble();
        System.out.println("digite o valor do metro quadrado: ");
        double valor = dados.nextDouble();
        

         double area = largura * comprimento;

         double preco = valor * area;

        System.out.printf("a largura do terrono é : %.2f%n", area + "o valor do terreno é : %.2f%n", preco);
    }
}
