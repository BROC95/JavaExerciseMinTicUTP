


// 1. Realizar la suma, la resta, la división y la multiplicación de dos números
// leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
// y <número 2> es igual a <resultado> ”.
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

    float n1,n2;
    System.out.println("Ingrese n1:");
    Scanner num1 = new Scanner(System.in);
    n1= num1.nextFloat();
    System.out.println("Ingrese n2:");
    Scanner num2 = new Scanner(System.in);
    n2= num2.nextFloat();
    float suma, resta,mult,divi;
    suma=n1+n2;
    resta=n1-n2;
    mult=n1*n2;
    if (n2!=0)
    {
        divi=n1/n2;
    }
    else{
        System.out.println("No se puede dividir por cero:");
        System.out.println("Ingrese de nuevo divisor:");
        Scanner num = new Scanner(System.in);
        n2=num.nextFloat();
        divi=n1/n2;
    }
    System.out.println("suma:"+suma);
    System.out.println("resta:"+resta);
    System.out.println("multiplicacion:"+mult);
    System.out.println("divición:"+divi);



 

 
    }


    }


    