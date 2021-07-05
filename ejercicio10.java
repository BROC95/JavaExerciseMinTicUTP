// 10.Muestra la serie de fibonacci hasta un número pedido por teclado. Por
// ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1,
// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89


import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar numero hasta donde va la serie de fibonacci:");
        int num = teclado.nextInt();

        int n0=0;
        int n1=1;
        System.out.println("Serie de Fibonacci");


        SerieFibocci(n0,n1,num);
        teclado.close();
    }
   public static void SerieFibocci(int n0,int n1,int num) {
    int terminoN_2 = n0; 
    int terminoN_1 = n1;

    int i=0;
    int SerieI=0;
    do{
          //Casos Base
          if(i==0 || i==1){
            System.out.printf("F(%d) = %d %n",i,i);                
        }else{//Caso general
            SerieI=terminoN_2+terminoN_1;
           
            int auxiliar = terminoN_2;
            terminoN_2 = terminoN_1;
            terminoN_1 = auxiliar+terminoN_1;
            if (SerieI>num)
            {
                break;
            }
            System.out.printf("F(%d) = F(%d) + F(%d) = %d %n",i,i-2,i-1,SerieI);
        }  
        i++;
    }
    while(SerieI<=num);
    
   }
}


    
    
