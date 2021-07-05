package main.java.co.edu.utp.misiontic2022.c2;

import java.util.Scanner;
import java.lang.Math;
// 5. Programa que lea la longitud de los catetos de un triángulo rectángulo y
// calcule la longitud de la hipotenusa según el teorema de Pitágoras
public class ejercicio5_C2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // var numeros=IngreseDatos();
        int i=1;
        do{

            System.out.println("Ingrese cateto");
            float cateto1= teclado.nextFloat();
            System.out.println("Ingrese cateto");
            float cateto2= teclado.nextFloat();
            if (cateto1>0 && cateto2>0)
            {
                // System.out.println("hola"+cateto1);
                Float pitagora= Pitagoras(cateto1, cateto2);
                Double pit= pitagora.doubleValue();
                pit= Math.sqrt(pit);
                System.out.println("Hipotenusa:"+pit);
                break;
            }
            else{
            System.out.println("No validos");
            }
        }
        while(i!=0);
        teclado.close();

    //    System.out.println(i);
    //    System.out.println(cateto2);
      
        // System.out.println("cateto1: "+cateto1+ " cateto2: "+cateto2);
        // System.out.println("cateto"+numeros);
        // Double pita= Pitagoras(cateto1, cateto2); 
        // System.out.println(pita);
        // teclado.close();
      

    }
    public static float Pitagoras(float cateto1,float cateto2) {
        Float mag = cateto1*cateto1+cateto2*cateto2;
        // Double mag1= mag.doubleValue();
        // mag=mag.doubleValue();
        // mag= Math.sqrt(mag);
        // System.out.println(mag);
        
        return mag;
        
    }
    // public static float IngreseDatos() {
    //     System.out.println("Ingrese cateto");
    //     float cateto1= teclado.nextFloat();
    //     System.out.println("Ingrese cateto");
    //     float cateto2= teclado.nextFloat();
    //     if (cateto1>0 && cateto2>0)
    //     {
    //         float [] catetos = {cateto1,cateto2};
    //         return cateto1;
    //     }
    //     else{
    //         IngreseDatos();
    //     }
    // }
}
