import java.util.Scanner;
public class EX03 {
 public static void main(String[] args) {
    String palavra = "Programacao";
    int vogais = 0;
    for (int i = 0; i < palavra.length(); i ++) {
        char letra = palavra.charAt(i);
       
            if (letra == 'a') {
                vogais++;
                
            }
            if(letra == 'e'){
                vogais++;

            }
            if(letra == 'i'){
               vogais++;
            }
           if(letra == 'o'){
              vogais++;
           }
           if(letra =='u'){
            vogais++;
           }

       System.out.println("Quantidade de vogais:" + vogais);

        }

    }
 
}

