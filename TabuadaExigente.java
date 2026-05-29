import java.util.Scanner;

public class TabuadaExigente {




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {

            int conta = numero * i;

            if (conta % 2 == 0) {

                System.out.println(conta);

            }

        }

    }

}