// 9. Pide por teclado el nombre, edad y salario y muestra el salario
// ○ Si es menor de 16 no tiene edad para trabajar
// ○ Entre 19 y 50 años el salario es un 5 por ciento más
// ○ Entre 51 y 60 años el salario es un 10 por ciento más
// ○ Si es mayor de 60 el salario es un 15 por ciento más

import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();
        int edad = teclado.nextInt();
        int salario = teclado.nextInt();
        System.out.println("Salario: %d",salario);

    }
}
