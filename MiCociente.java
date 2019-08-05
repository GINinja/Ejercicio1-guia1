import java.util.Scanner;
/**
 *Herramienta para calcular el cociente de una division.
 *
 * @author (GINinja)
 * @version (a version number or a date)
 */
public class MiCociente
{
      public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("Ingrese el valor del divisor presione espacio e ingrese el valor del dividendo ");
      int divisor = scan.nextInt();
      int divident = scan.nextInt();

      int quotient = divident / divisor;
      int remainder = divident % divisor;

      System.out.println("El cociente es:"+quotient);
      System.out.println("El residuo es:"+remainder);
   }
    }

