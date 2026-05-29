//A Soma dos Ímpares*
//Dado um número limite N (ex: 20), crie um laço de repetição que passe por todos os números de 1 até N e some apenas os números ímpares. Imprima o resultado final dessa soma.


import java.util.Scanner;

public class SomaImpares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroLimite;
        int soma = 0;

        System.out.print("Digite o número limite: ");
        numeroLimite = scanner.nextInt();

        for (int i = 1; i <= numeroLimite; i++) {

            if (i % 2 != 0) {

                soma = soma + i;

            }
        }

        System.out.printf("A soma dos números ímpares é: %.2f%n", (double) soma);

        scanner.close();
    }
}