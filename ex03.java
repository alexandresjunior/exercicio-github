// Crie uma variável String palavra = "programacao";. Use um 
// laço de repetição parapercorrer cada letra da palavra 
// e conte quantas vogais (a, e, i, o, u) ela possui. Imprima
// o total no final.

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = "programacao";

        int contadorvogais = 0;

        for (int i =0; i < palavra.length(); i++) {

            char letra = palavra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {

                contadorvogais++;
                
            }

            System.out.println("A palavra "+palavra+ " tem o total de "+contadorvogais+ "vogais.");
        }
    }
}
