
package main.java.co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
// 8. Programa que lea dos números por teclado y muestre el
// resultado de la división del primer número por el segundo. Se
// debe comprobar que el divisor no puede ser cero
public class ejercicio8_C2 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int i=1;
    do{
    System.out.println("Ingresar primer número");
    float num1 = teclado.nextFloat();
    System.out.println("Ingresar segundo número");
    float num2 = teclado.nextFloat();
    if (num2!=0)
    {
        System.out.printf("Division: %f/%f=%f",num1,num2,num1/num2);
        break;
    }
    else{
        System.out.println("No se puede dividir por cero");
    }

    }while(i!=0);
    teclado.close();

    
   }
    
}
