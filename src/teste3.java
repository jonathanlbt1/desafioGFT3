import java.util.Scanner;

public class teste3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char c;

        int contador = 0;
        double entrada = 0;

        double coelhos = 0;
        double ratos = 0;
        double sapos = 0;
        double animaisTotal = 0;

        int testes = input.nextInt();

        while (contador < testes){
            contador++;
            entrada = input.nextInt();
            animaisTotal += entrada;
            c = input.next().charAt(0);

            if(c == 'C') {
                coelhos += entrada;
            } else if (c == 'R') {
                ratos += entrada;
            } else if (c == 'S') {
                sapos += entrada;
            }
        }
        System.out.println("Total: " + (int) animaisTotal + " cobaias");
        System.out.println("Total de coelhos: " + (int) coelhos);
        System.out.println("Total de ratos: " + (int) ratos);
        System.out.println("Total de sapos: " + (int) sapos);

        double mediaCoelhos = coelhos / animaisTotal * 100;
        double mediaRatos = ratos / animaisTotal * 100;
        double mediaSapos = sapos / animaisTotal * 100;

        System.out.println(String.format("Percentual de coelhos: %.2f", mediaCoelhos) + " %");
        System.out.println(String.format("Percentual de ratos: %.2f", mediaRatos) + " %");
        System.out.println(String.format("Percentual de sapos: %.2f", mediaSapos) + " %");

        input.close();
    }
}