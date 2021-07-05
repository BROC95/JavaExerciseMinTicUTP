/**3. Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000.*/

import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {

        int horaPago=30000;
        int HorT;
        System.out.println("Ingresar Horas de trabajo en el mes: ");
        Scanner horaTrabajo=new Scanner(System.in);
        HorT=horaTrabajo.nextInt();
        horaTrabajo.close();
        System.out.println("Horas trabajadas: "+HorT);
        int Sueldo;
        Sueldo = horaPago*HorT;
        System.out.println("Sueldo: "+Sueldo);
     
        }
}
