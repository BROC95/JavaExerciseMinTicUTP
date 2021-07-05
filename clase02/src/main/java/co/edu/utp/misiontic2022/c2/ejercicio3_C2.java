
package main.java.co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
import java.lang.Math;

// 3. Programa que lea dos variables enteras N y m y le quite a N sus m últimas
// cifras.
// Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234
public class ejercicio3_C2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número:");
        Integer N = teclado.nextInt();
        System.out.println("Ingrese numero de cifras a quitar:");
        int M = teclado.nextInt();
        int lenN = cifras(N);
        if (M<=lenN)
        {
            System.out.println("Cifras correctas");
        }
        else
        { do{
            System.out.println("Cifras debe ser menor a "+lenN);
            System.out.println("Ingrese numero de cifras a quitar:");
            M = teclado.nextInt();
        }
        while(M>=lenN);
            
        }
        Double Base=Math.pow(10, M);
        // System.out.println(Base);
        Double numc = N/Base;
        int num = numc.intValue();
        System.out.printf("numero ingresdo %d : numero reducido %d",N,num);
        teclado.close();
    }
    public static int  cifras(int num) {

        int i=0;
        while(num!=0)
        {
            num/=10;
            i++;
        }
        return i;
        
    }
}
