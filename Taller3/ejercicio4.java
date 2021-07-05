
// 4. Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
// número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
// tabla y mostrar los datos.


import java.util.Scanner;

public class ejercicio4 {
    public static void main (String[] args){
        System.out.println("hola");
        System.out.println("Por favor ingrese su nombre");
        System.out.println("Ingrese tabla de multiplicar: ");
        int tabla=0;
        var num = new Scanner(System.in);
        tabla=num.nextInt();
        num.close();
        System.out.println("Tabla del "+tabla);
        for(int i =0;i<11;i++)
        {
            System.out.println(tabla+"x"+i+"= "+i*tabla);
        }
    


    }
   

}
