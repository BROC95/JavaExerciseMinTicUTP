
package main.java.co.edu.utp.misiontic2022.c2;
// 11. Programa que lea una variable entera mes y compruebe si el
// valor corresponde a un mes de 30 días, de 31 o de 28.
// Supondremos que febrero tiene 28 días. Se mostrará además el
// nombre del mes. Se debe comprobar que el valor introducido esté
// comprendido entre 1 y 12

import java.util.Scanner;

public class ejercicio11_C2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String Mes="";
        int dias=1;
        int i=1;

        int mes;
        do{
            System.out.println("Ingresa número del mes a consultar: ");
            mes = teclado.nextInt();
     
        
        switch(mes){
            case 1:
            { 
                Mes="Enero";
                dias=31;
                i=0;


                break;
            }
            case 2:
            {
                Mes="Febrero";
                dias=28;
                i=0;
                break;
            }
            case 3:
            { 
                Mes="Marzo";
                dias=31;
                i=0;


                break;
            }
            case 4:
            {
                Mes="Abril";
                dias=30;
                i=0;
                break;
            }
            case 5:
            { 
                Mes="Mayo";
                dias=31;
                i=0;


                break;
            }
            case 6:
            {
                Mes="Junio";
                dias=30;
                i=0;
                break;
            }
            case 7:
            { 
                Mes="Julio";
                dias=31;
                i=0;


                break;
            }
            case 8:
            {
                Mes="Agosto";
                dias=31;
                i=0;
                break;
            }
            case 9:
            { 
                Mes="Septiembre";
                dias=30;
                i=0;


                break;
            }
            case 10:
            {
                Mes="Octubre";
                dias=31;
                i=0;
                break;
            }
            case 11:
            { 
                Mes="Noviembre";
                dias=30;
                i=0;


                break;
            }
            case 12:
            {
                Mes="Diciembre";
                dias=31;
                i=0;
                break;
            }
            default:
            {
                System.out.println("Entrada erronea");
                continue;
            }

        }
        
        }
        while(i!=0);
        System.out.printf("\nMes %d = %s, tiene %d dias\n",mes,Mes,dias);
        teclado.close();
    }
    
}
