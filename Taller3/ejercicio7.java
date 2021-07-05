// 7. Pedir un número, comprobar si es primo y preguntar si quiere introducir más
// (S/N) y volver a pensar.


import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        int num;
        int i =1;
        do{
            System.out.println("Introducir numero");
        Scanner dato = new Scanner(System.in);
        num= dato.nextInt();
    
        if (num%2==0)
        {
            System.out.println("Numero "+num+" es par ");
        }
        else{
            System.out.println("Numero "+num+" es impar ");
        }
        System.out.println("Desea introducir otro numero (S/N)");
        Scanner letra = new Scanner(System.in);
        char cond = letra.next().charAt(0);
        if (cond=='S')
        {
            System.out.println("Volver a pensar...");
            continue;
        }
        else if (cond=='N')
        {
            System.out.println("Gracias por usar la app");
            break;
        }
        i++;
        }
        while(i!=0);
        


        
    }

    
}
