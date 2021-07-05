// 1. Programa que pida por teclado la fecha de nacimiento de una persona 
// (día, mes, año) y calcule su número de la suerte.
// El número de la suerte se calcula sumando el día, mes y año de la fecha 
// de nacimiento y a continuación sumando las cifras obtenidas en la suma
package main.java.co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class ejercicio1_C2 {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println( "Ingrese una fecha: " ); // 12/06/1990
        String fecha = input.nextLine();
        input.close();

        int indiceSeparador = fecha.indexOf('/');
        System.out.println(indiceSeparador);

        int dia = Integer.parseInt(fecha.substring(0,indiceSeparador));

        int indiceSeparador2 = fecha.lastIndexOf('/');

        int mes = Integer.parseInt(fecha.substring(indiceSeparador+1,indiceSeparador2));

        int anio = Integer.parseInt(fecha.substring(indiceSeparador2+1, fecha.length()));

        int numeroSuerte = dia + mes + anio;

        int len = String.valueOf(numeroSuerte).length();

        int aux = 0;
        int digito = 0;

        /*
        for (int i = 0; i < len ;i++)
        {
            digito = numeroSuerte % 10;
            aux += digito;
            numeroSuerte /= 10;
        }
        */

        while(numeroSuerte!=0){
            digito = numeroSuerte % 10;
            aux += digito;
            numeroSuerte /= 10;
        }
    
        System.out.printf("Tu numero de la suerte es: %d", aux);
        
    }
}
