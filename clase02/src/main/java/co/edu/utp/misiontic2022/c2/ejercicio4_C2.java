package main.java.co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
import java.lang.Math;
// 4. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
// teclado
public class ejercicio4_C2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese velocidad en km/h");
        float num = teclado.nextFloat();
        int numc=Math.round( KmH_to_mS(num));
        System.out.println("Conversion "+num+" Km/h a s/m es :"+numc+" m/s");
        teclado.close();

    }
    public static float KmH_to_mS(float num) {
    return (num*1000)/3600;        
    }
    
}
