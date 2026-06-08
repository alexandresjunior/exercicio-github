import java.util.Scanner;

public class Questao01FolhaPagamento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horasTrabalhadas;
        double valorHora;

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor da hora: ");
        valorHora = scanner.nextDouble();

        scanner.close();
    }
}