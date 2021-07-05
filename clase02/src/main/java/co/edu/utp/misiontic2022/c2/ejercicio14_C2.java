package main.java.co.edu.utp.misiontic2022.c2;

import java.util.Scanner;
public class ejercicio14_C2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese N terminos de la serie:");
       

        int N= teclado.nextInt();
        if (N>47)
        {
            System.out.println("Recomienda N<=47:");
            N= teclado.nextInt();

        }
        int SERIE= SerieFibonacci(N);
        teclado.close();

    }
    public static int SerieFibonacci(int N) {
        int n1=0;
        int n2=1;
        int nA=0;
        int [] SerieF= new int[N];
        SerieF[0]=n1;
        SerieF[1]=n2;
        int serie;
        for (int i=1;i<N;i++)
        {
            serie=n1+n2;
            nA=n2;
            n2=n1;
            n1=nA+n1;
            SerieF[i]=serie;
           
        }
        for(int i=0;i<N;i++)
        {
            System.out.printf("\n%d:    %d",i,SerieF[i]);
        }
        return 1;
        
    }
}
