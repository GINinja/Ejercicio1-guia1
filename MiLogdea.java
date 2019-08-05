import java.util.Scanner;
/**
 * Herramienta para allar el logaritmo de un entero.
 *
 * @author (GINinja)
 * @version (a version number or a date)
 */
public class MiLogdea
{
    public static void main(String args[]){ 
      Scanner scan = new Scanner( System.in );
    double a;

    System.out.print  ("Ingrese un numero para calcular su logaritmo:");
    a = scan.nextDouble();
    
    double result = Math.log( a );

System.out.println("logaritmo: " + result );
}
}