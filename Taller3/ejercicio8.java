// 8. Realizar un programa que permita controlar el juego de piedra, papel, tijera
// introduciendo P para piedra, L para papel y T para tijera por cada jugador.
// El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
// de cada ronda preguntar si desea volver a jugar.

import java . util . Scanner;
public class ejercicio8 {

public static void main(String[] args) {
//Variables


char n1,n2;
//Entrada
Scanner teclado= new Scanner (System . in) ;
int i=1;
System.out.println("Juego de Piedra (P) Papel (L) o Tijera (T)");
do{
    System.out.print( "JUGADOR 1 : " ) ;
    n1 = teclado.next().charAt(0);
    System.out.print ( "JUGADOR 2 : " ) ;
    n2 = teclado.next().charAt(0);
    if ((n1=='P' || n1=='L' ||n1=='T') && (n2=='P' || n2=='L' ||n2=='T'))
    {
        break;
    }
    else{
        System.out.println("Entrada erronea debe elegir (P/L/T)");
    }
}while(i!=0);

Piedra(n1,n2);
}
public static void Piedra(char ju1,char ju2) {
    System.out.println(ju1+"vs"+ju2);
    if (ju1 == ju2)
    {
        System.out.println("Empate, "+ju1+" vs "+ju2);
        
    } 
    else if (ju1 =='L' && ju2=='P')
    {
        System.out.println("Gana Papel en "+ju1+" vs "+ju2);
        System.out.println("Jugador 1 gana "+ju1);

    }
    else if (ju1 =='P' && ju2=='T')
    {
        System.out.println("Gana Piedra en "+ju1+" vs "+ju2);
        System.out.println("Jugador 1 gana "+ju1);

    }
    else if (ju1 =='T' && ju2=='L')
    {
        System.out.println("Gana Tijera en "+ju1+" vs "+ju2);
        System.out.println("Jugador 1 gana "+ju1);

    }
    else if (ju1 =='P' && ju2=='T')
    {
        System.out.println("Gana Piedra en "+ju1+" vs "+ju2);
        System.out.println("Jugador 1 gana "+ju1);

    }
    else if (ju2 =='P' && ju1=='T')
    {
        System.out.println("Gana Piedra en "+ju1+" vs "+ju2);
        System.out.println("Jugador 2 gana "+ju2);

    }
    else if (ju2 =='T' && ju1=='L')
    {
        System.out.println("Gana Tijera en "+ju1+" vs "+ju2);
        System.out.println("Jugador 2 gana " +ju2);

    }
    else if (ju2 =='P' && ju1=='T')
    {
        System.out.println("Gana Piedra en "+ju1+" vs "+ju2);
        System.out.println("Jugador 2 gana "+ju2);

    }
    
}
}