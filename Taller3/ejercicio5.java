// 5. Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
// adivinar introduciendo el número por teclado. En el caso que el número a
// adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
// mayor”, de lo contrario, “El número que busca es menor”. El programa
// finalizará cuando se introduzca el número correcto. Nota: usar la clase
// Random para generar el número aleatorio.

// import java.math.MathContext;
import java.util.Random;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        int numero;
        // int valorDado;
        // System.out.println("Ingresar número ");
        // Scanner n= new Scanner(System.in);
        // numero = n.nextInt();
       
        Random nA = new Random();
        int valorDado = nA.nextInt(100);
        // nAlea= nA.nextInt();
        // System.out.println(valorDado);
        do{
            System.out.println("Ingresar número ");
            Scanner m= new Scanner(System.in);
            numero = m.nextInt();
            if (numero>valorDado)
            {
                System.out.println("“El número que busca es menor”");
                continue;
            }
            else if (numero<valorDado)
            {
                System.out.println("“El número que busca es mayor”"); 
                continue;
            }
            else if(valorDado==numero)
            {
                System.out.println("“El número que busca ha sido encontrado” "+valorDado);
                m.close();
                break; 
                
            }
        }
        while(numero!=valorDado);
        
      
  


        
    }
    
}
