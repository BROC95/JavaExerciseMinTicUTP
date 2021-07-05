
// 2. Realizar un programa que realice el promedio de las notas de un alumno,
// para ello el programa va a tener que solicitar el nombre del alumno y las
// notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
// 3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
// “Reprobado” . Requisitos: Las notas que se ingresan pueden tener
// decimales.

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int notas;
        // sc.close();
        
        System.out.println("Por favor ingrese numero de notas");
        var n = new Scanner(System.in);
        notas = n.nextInt();
        // n.close();




        

        int i;
        float cont=0;
        float nota;
        System.out.println("Por favor ingrese su nombre");
        var nombre = sc.nextLine();
        int k=1;
        Scanner no = new Scanner(System.in);
         for (i=0;i<notas;i++)
         { 
          
            
            System.out.println(i+"- "+nombre+" ingrese nota "+k);
            System.out.println("Nota "+k+": "+nombre+":\n");
           
            nota = no.nextFloat();
            if (nota >0 && nota<=5)
            {
                cont+=nota;
            }
            else
            {
                System.out.println("Nota debe estar entre 0 y 5");
                System.out.println(i+"- "+nombre+" ingrese nota "+k);
                System.out.println("Nota "+k+": "+nombre+":\n");
                // Scanner no = new Scanner(System.in);
                nota = no.nextFloat();
                cont+=nota;

            }
            k++;
            
         }
         float prom;
         System.out.println("Suma: "+cont+":\n");
         prom = cont/notas;
         System.out.println("Promedio ="+prom);
         if (prom>=3 && prom <=5)
         {
             System.out.println(nombre+" Aprobo");
         }
         else
         {
            System.out.println(nombre+" Reprobo");
         }
        

       


        }
}
