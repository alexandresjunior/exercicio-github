import java.util.Scanner;

public class SomadorDeDigitos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        while (numero > 0) {

            soma = soma + (numero % 10);

            numero = numero / 10;
        }

        System.out.println("A soma dos dígitos é: " + soma);

        entrada.close();
    }
}