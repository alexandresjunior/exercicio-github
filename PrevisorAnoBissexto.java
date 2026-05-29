import java.util.Scanner;

public class PrevisorAnoBissexto{

public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano a sua escolha: ");

        
        int numeroAnos = 5;
        int ano = sc.nextInt();

        
        if(ano % 4 == 0){
            ano += 4;

        }else{
            while( ano % 4 != 0){
            ano += 1;
            }

        }

    for (int i = 0; i < numeroAnos; i++) {
           System.out.println(i+  "° ano bissexto: " + (ano + 4*i) );
    }


        sc.close();
    }
}