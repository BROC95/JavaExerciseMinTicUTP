// 9. Pide por teclado el nombre, edad y salario y muestra el salario
// ○ Si es menor de 16 no tiene edad para trabajar
// ○ Entre 19 y 50 años el salario es un 5 por ciento más
// ○ Entre 51 y 60 años el salario es un 10 por ciento más
// ○ Si es mayor de 60 el salario es un 15 por ciento más

import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar nombre,edad y salario:");
        String nombre = teclado.nextLine();
        int edad = teclado.nextInt();
        float salario = teclado.nextInt();
        float aumento;

        // System.out.printf("Salario: %d",salario);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
        if (edad<16)
        {
            System.out.println("No tiene edad para trabajar");
        }
        else if (edad>=19 && edad <=50)
        {
            System.out.println("Salario aumento del 5%");
            System.out.println("Edad entre 19 y 50 años");
            aumento=salario*5/100;
            salario=salario+aumento;
            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+edad);
            System.out.println("Salario: "+salario);

            
        }
        else if (edad>50 && edad <=60)
        {
            System.out.println("Salario aumento del 5%");
            System.out.println("Edad entre 51 y 60 años");
            aumento=salario*10/100;
            salario=salario+aumento;
            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+edad);
            System.out.println("Salario: "+salario);

            
        }
        else if (edad>60)
     {
            System.out.println("Salario aumento del 5%");
            System.out.println("Edad entre 19 y 50 años");
            aumento=salario*15/100;
            salario=salario+aumento;
            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+edad);
            System.out.println("Salario: "+salario);

            
        }
        teclado.close();

    }
}
