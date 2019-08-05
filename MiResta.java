import java.util.Scanner;
/**
 * Herramienta para realizar restas.
 *
 * @author (GINinja)
 * @version (07252019)
 */
public class MiResta
{
     public static void main(String args[])
   {
      int a, b, c;
 
      System.out.println("Ingrese dos numeros para calcular su diferencia");
      Scanner in = new Scanner(System.in);
     
      a = in.nextInt();
      b = in.nextInt();
      c = b - a;
     
      System.out.println("La diferencia entre los numeros es = " + c);
   }
    
}
