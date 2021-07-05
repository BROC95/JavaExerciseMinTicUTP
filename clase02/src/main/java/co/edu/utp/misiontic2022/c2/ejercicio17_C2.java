
package main.java.co.edu.utp.misiontic2022.c2;

public class ejercicio17_C2 {
    public static void main(String[] args) {
        int n=5;
        for(int i =1;i<=n;i++)
        {
            if (i==3)
            {
                // System.out.println("E");
                ImprimerE();
            }
            else{
                System.out.println(i);
            }
        }
        // ImprimerE();        
    }
    public static void ImprimerE() {
        int n=5;
        int m=4;
        String [][] arr= new String[n][m];


        for(int i=0;i<n;i++)
        {
            for(int k=0;k<m;k++)
            {
                if (i==0)
                {
                    arr[i][k]="*";
                }
                else if (i==2)
                {
                    arr[i][k]="*";
                }
                else if (i==4)
                {
                    arr[i][k]="*";
                }
                else if(k==0)
                {
                    arr[i][k]="*";
                }
                else{
                    arr[i][k]=" ";
                }
            }

        }
        int i;
            for(i=0;i<n;i++)
        {
            for(int k=0;k<m;k++)
            {
                System.out.print(arr[i][k]);
            
                // System.out.printf("(%d,%d)",i,k);

            }
            System.out.print("\n");
        }
        
    }
    
}
