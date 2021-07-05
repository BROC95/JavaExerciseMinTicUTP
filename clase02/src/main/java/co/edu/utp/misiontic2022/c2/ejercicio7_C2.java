
package main.java.co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

// 7. Programa que lea un carácter por teclado y compruebe si es
// una letra mayúscula.
public class ejercicio7_C2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // char Letra = teclado.next().charAt(0);
        System.out.println("Ingresar letra: ");
        String L = teclado.nextLine();
        String Mayus= L.toUpperCase();
        // System.out.println(L);
        // System.out.println(Mayus);
        if (L== Mayus)
        {
            System.out.println("La letra ingresada es mayuscula "+ Mayus);
        }
        else{
            System.out.println("No es mayuscula");
        }
        teclado.close();
    }
}
