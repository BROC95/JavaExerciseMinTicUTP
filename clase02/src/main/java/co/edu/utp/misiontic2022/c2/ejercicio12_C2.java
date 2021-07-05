
package main.java.co.edu.utp.misiontic2022.c2;

// 12. Realizar programa que muestre los números del 1 al 100 que no
// sean múltiplos de 3, utilizando cada una las instrucciones
// repetitivas (while, do while, for)
import java.util.Scanner;
public class ejercicio12_C2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Números del 1 al 100 que no son multiplos de 3");
        int N=100;
        int num=3;
        System.out.println("______for________");
        for(int i =1; i<N;i++)
        {
            if(i%num==0)
            {
                System.out.printf("\nMultiplo de %d: %d",num,i);
            }
        }
        System.out.println("\n______while________");
        int i=1;
        while(i>100)
        {
            if(i%num==0)
            {
                System.out.printf("\nMultiplo de %d: %d",num,i);
            }
            i++;
        }
        System.out.println("\n____do__while________");
        i=1;
        do{
            if(i%num==0)
            {
                System.out.printf("\nMultiplo de %d: %d",num,i);
            }
            i++;

        }while(i<=N);

        System.out.println("\n_____Ciclos_Java________");
        teclado.close();
    }
}
