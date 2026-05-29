import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("\nCalculadora de potência!\n");
        System.out.print("\nDigite o valor da base: ");
        int base = scn.nextInt();
        System.out.print("\nDigite o valor do expoente: ");
        int expoente = scn.nextInt();

        int potencia = 1;

        for (int i = 0; i < expoente; i++) {
            potencia = potencia*base;
        }

        System.out.printf("\nO valor de %d elevado a %d é: %d", base, expoente, potencia);
        scn.close();
    }
}
