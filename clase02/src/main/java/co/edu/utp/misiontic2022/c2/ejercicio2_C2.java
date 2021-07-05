// 2. Programa que calcule el precio de venta de un producto conociendo el precio
// por unidad (sin IVA) del producto, el número de productos vendidos y el
// porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado

package main.java.co.edu.utp.misiontic2022.c2;

import java.util.Scanner;
import java.lang.Math;
public class ejercicio2_C2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese valor del producto sin IVA:");
        float precio= teclado.nextFloat();
        System.out.println("Ingrese unidades:");
        float unidad= teclado.nextFloat();
        System.out.println("Ingrese IVA:");
        float iva = teclado.nextFloat();

        float valorNeto =precio+ precio*iva/100;
        float unidadesT = valorNeto*unidad;
        unidadesT=Math.round(unidadesT);
        System.out.printf("Valor con IVA %f, unidades %f: Total a pagar: %f",valorNeto,unidad,unidadesT);
        teclado.close();
    }
}
