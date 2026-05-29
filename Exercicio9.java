import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 6;
        System.out.println("6 é divisivel por: "); 

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
            
        }

        sc.close();
    }
}
