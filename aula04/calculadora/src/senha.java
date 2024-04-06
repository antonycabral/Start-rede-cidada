import java.util.Scanner;

public class senha {
    
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

        String emailC = "daku@marcadefogão";
        String senhaC = "2022";

        while (true) {

            System.out.println("insira seu email: ");
            String email = dados.nextLine();

            System.out.println("insira a senha: ");
            String senhaI = dados.nextLine();

            if (!emailC.equals(email) || !senhaC.equals(senhaI)) {
                System.out.println("Acesso Permitido!! ");
                break;
            }else{
                System.out.println("erro. senha ou email!");
        }
    }
}
}