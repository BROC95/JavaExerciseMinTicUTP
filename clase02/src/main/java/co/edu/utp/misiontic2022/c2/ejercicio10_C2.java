
package main.java.co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// 10. Programa que lea por teclado tres números enteros H, M, S
// correspondientes a hora, minutos y segundos respectivamente, y
// comprueba si la hora que indican es una hora válida

public class ejercicio10_C2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] hora = new int[3];
        int k=1;
        do{
            System.out.println("Ingresar hora minutos y segundos: ");
            for (int i=0;i<3;i++)
            {
                hora[i]=teclado.nextInt();
            }
            System.out.println("Hora: ");
            if (((hora[0]>0 && hora[0]<=23))&&((hora[1]>0 && hora[1]<=59))&& ((hora[2]>0 && hora[2]<=59)))
            {   System.out.println("Hora valida");
                System.out.println(hora[0]+":"+hora[1]+":"+hora[2]);
                break;
            }
            else{
                System.out.println("Hora invalida");
            }
        }
        while(k!=0);
       
        teclado.close();
       
    }
}
