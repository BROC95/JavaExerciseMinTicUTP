package main.java.co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// 15. Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N
public class ejercicio15_C2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número N");
        int num= teclado.nextInt();
        int [] nums =new int[num];
        int [] factN= new int[num];
        for(int i=0;i<num;i++)
        {
            nums[i]=i;
        } 
        int suma=0;
        System.out.println("_______");
        for(int i=0;i<num;i++)
        {
           factN[i]=  factorial(nums[i]);
           System.out.println(i+"!="+factN[i]);
           suma+=factN[i];
        } 
        String valor="";
        for(int i=0;i<num;i++)
        {
            valor+= ""+nums[i]+"!+";
        }
     
        teclado.close();
        System.out.println("_______");
        String str = valor;
		str = str.substring(0, str.length()-1);
		System.out.println(str+"="+suma);

    }
    public static int factorial(int num) {
        int fac=1;
        for(int i=1;i<=num;i++)
        {
            fac*=i;
        }
        if (num==0)
        {
            fac=1;
        }
        

        return fac;
        
    }

        
          
    
    
}
