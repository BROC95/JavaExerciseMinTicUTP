
package main.java.co.edu.utp.misiontic2022.c2;
// 13. Programa que pase de pesos a dólares y viceversa
import java.util.Scanner;
import java.lang.Math;
public class ejercicio13_C2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar Dolares");
        float dolar=teclado.nextFloat();
        float conversionD=Dolar_to_pesos(dolar);
        System.out.println("Dolar a pesos "+conversionD);
        System.out.println("Ingresar Pesos");
        float pesos= teclado.nextFloat();
        double conversionP=Pesos_to_dolar(pesos);
        conversionP= Math.round(conversionP);
        System.out.println("Pesos a dolar "+conversionP);
        teclado.close();
        
    }
    public static float Dolar_to_pesos(float dolar) {
        float dolar_hoy=3742;
        return dolar*dolar_hoy;
    }
    public static Double Pesos_to_dolar(float pesos) {
        // System.out.println(1/3700.0);
        Double pesos_hoy=1.0/3742.0;
        // Double pesos_hoy=1/(3700.0);
        // pesos_hoy=pesos_hoy.floatValue();
        
        

        // System.out.println(pesos_hoy);
        return pesos*pesos_hoy;
    }
}
