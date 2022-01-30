import java.io.IOException;
import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int senha = 2002;

        while (true) {
            if (leitor.nextInt() != 2002) {
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
                break;
            }
        }

    }
}