import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

        System.out.println("insira o numero de linhas: ");
        int n = dados.nextInt();

        System.out.println("insira o numero de colunas: ");
        int m = dados.nextInt;

        int [][] matriz = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("no elemento [%d, %d]", i,j);
                matriz[i][j] = dados.nextInt();
            }
        }

        for(int i = 0; i< n; i++){
            for(int j =0;j < m; j++){
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
