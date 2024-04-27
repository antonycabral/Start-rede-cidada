import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Scanner dados = new Scanner(System.in);

                System.out.println("insira o numero de linhas: ");
                int n = dados.nextInt();

                System.out.println("insira o numero de colunas: ");
                int m = dados.nextInt();

                int [][] matriz = new int[n][m];

                for(int i = 0; i < n; i++){
                    for(int j = 0; j < m; j++){
                        System.out.printf("digite o numero [%d, %d]", i,j);
                        matriz[i][j] = dados.nextInt();
                    }
                }

                for(int i = 0; i< n; i++){
                    for(int j =0;j < m; j++){
                        System.out.printf("%5d", matriz[i][j]);
                    }
                    System.out.println();
                }

        System.out.println("diagonal princiapal");

                for (int i = 0; i < matriz.length; i++){
                    System.out.println(matriz[i][i]);
        }
        }
    }
