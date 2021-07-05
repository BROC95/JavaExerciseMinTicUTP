

package main.java.co.edu.utp.misiontic2022.c2;
import java.lang.Math;
import java.util.Scanner;// 9. El programa lee por teclado tres números enteros y calcula y
// muestra el mayor de los tres.
public class ejercicio9_C2 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
   
    System.out.println("Ingrese el rango del valor maximo como entrada:");
    int min_value=teclado.nextInt();
    System.out.println("Ingrese el número de  entradas:");
    int N=teclado.nextInt();
    int [] nums = new int[N];
    System.out.printf("Ingresa %d números",N);
    for(int i=0; i<N; i++)
    {   System.out.printf("\nIngresa %d números: ",i);
        nums[i]= teclado.nextInt();
        if (nums[i]>min_value)
        {
            System.out.println("Número debe ser menor a "+min_value);
            System.out.printf("Ingresa %d números: ",i);
            nums[i]= teclado.nextInt();
        }
    }
    System.out.println("----------------");
 
 
  

    for(int i=0; i<N; i++)
    {

       if ( nums[i]<min_value)
       {
           min_value=nums[i];
       }
    
    }
    System.out.println("----------------");
    System.out.println("Número de menor valor es "+min_value);
    teclado.close();
 
}
}