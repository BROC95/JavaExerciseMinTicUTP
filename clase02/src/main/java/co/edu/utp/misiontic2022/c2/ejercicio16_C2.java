

package main.java.co.edu.utp.misiontic2022.c2;

// 16. Programa que muestre en líneas separadas lo siguiente:
// ZYWXVUTSRQPONMLKJIHGFEDCBA
// YWXVUTSRQPONMLKJIHGFEDCBA
// WXVUTSRQPONMLKJIHGFEDCBA
// ....
// DCBA
// CBA
// BA
// A
public class ejercicio16_C2 {
    public static void main(String[] args) {
        
        String abc= "ZYWXVUTSRQPONMLKJIHGFEDCBA";
        int len=abc.length();
        int i;
        int m=0;
        String inver;
        for(i=0;i<len;i++)
        {   System.out.println(abc);
            inver= Invertir(abc);
            
            m=inver.length();
            abc=inver.substring(0,m-1 );
            
            abc= Invertir(abc);
          
        }
       
    } 
    public static String Invertir(String abc) {
        char[] arr = abc.toCharArray();
        char[] arr2 = abc.toCharArray();
        int N= abc.length();
   
        int j=0;
        // System.out.println("**************");
        for (int k=N;k>0;k--)
        {
      
            arr2 [j]=arr[k-1];
            j++;
        }
        String cadena2="";
        for (char el:arr2 ){
            // System .out.println (el);
            cadena2+=el;
        }
        // System.out.println(cadena2);
        return  cadena2;
        
    }   
}
