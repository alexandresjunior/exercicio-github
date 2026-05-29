// Crie um programa que receba um número N. Ele deve calcular a tabuada desse número 
// de 1 a 10, mas *só deve imprimir* os resultados que forem números pares.

import java.util.Scanner;

public class calcumadez {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Digite um numero: ");
       int numero = sc.nextInt();

       for (int i = 0; i < 10; i++){
       int conta = numero * i; 

       System.out.println( +numero+ " X " +i+ " = " +conta);

       
       if (conta % 2 == 0 ) {
        System.out.println("este numero é par: "+conta);
   
    }

    else {
        System.out.println("Este numero é ímpar: " +conta );
    }
} 

sc.close();
    }
}
