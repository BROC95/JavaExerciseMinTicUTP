// 6. Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
// que calcule el peso ideal.
// ○ peso ideal mujeres = altura - 120
// ○ peso ideal hombres = altura - 110


// import java.util.Random;
import java.util.Scanner;
public class ejercicio6 {
 

        
    // }
    public static void main(String[] args) {
       
        float altura;
        float pesoIM;
        float pesoIH;
        char Sexo;
        int cont=1;
        Scanner teclado= new Scanner(System.in);
        do{
            System.out.println("Por favor ingrese sexo (H/M)");
       
        Sexo = teclado.next().charAt(0);
        // caracter = escaneo.next().charAt(0);
        // System.out.println(Sexo);
        if (Sexo=='H')
        {
            System.out.println(Sexo);
            break;
        }
        else if (Sexo =='M'){
            System.out.println(Sexo);
            break;
        }
        System.out.println(Sexo);
        }

        while(cont!=0);
        
        // entraS.close(); 
        System.out.println("Por favor ingrese altura en cm (1,75) ");
        // Scanner entraA= new Scanner(System.in);
        altura = teclado.nextFloat();
        altura=altura*100;
        // entraA.close();
        // int pesoI;
        // pesoI= PesoI(altura, Sexo);
        // System.out.println(pesoI);
        System.out.println(Sexo);
        System.out.println(altura+" cm");
        float pesoI=0;
        if (Sexo=='H')
        {
            pesoI=altura-110;
        }
        else if (Sexo =='M')
        {
            pesoI=altura-120;
        }
        System.out.println("Peso ideal para el sexo "+Sexo+" es de "+pesoI+" Kg");
        }
    public  static int PesoI(int altura,char Sexo){
        System.out.println(Sexo);
        System.out.println(altura+" cm");
        int pesoI=0;
        // System.out.println( pesoI.getClass().getName());
       
        if (Sexo=='H')
        {
            pesoI=altura-110;
        }
        else if (Sexo =='M')
        {
            pesoI=altura-120;
        }
        return pesoI;
    }
    
}
