
import java.util.Scanner;
/**
 * Herramienta para calcular el valor de un numero elevado a cierta potencia.
 *
 * @author (GINinja)
 * @version (a version number or a date)
 */
public class MiPower
{public static void main(String[] args) { 
    Scanner scan = new Scanner( System.in );
    System.out.println("Ingrese un numero presione espacio e ingrese el valor del exponente");
         int a = scan.nextInt();
         int b = scan.nextInt();
        double result = Math.pow(a, b);
        System.out.println("Answer = " + result);
    }
    }
    
  
    

