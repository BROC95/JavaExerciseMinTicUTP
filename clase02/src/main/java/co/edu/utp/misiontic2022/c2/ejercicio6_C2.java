
package main.java.co.edu.utp.misiontic2022.c2;

import java.util.Scanner;
public class ejercicio6_C2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar número");
        int num = teclado.nextInt();
        if (num%10==0)
        {
            System.out.println(num+" es multiplo de 10");
        }
        else{
            System.out.println(num+" no es multiplo de 10");
        }
        teclado.close();
    }
}
