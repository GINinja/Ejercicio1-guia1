import java.util.Scanner;
/**
 * Herramienta para realizar sumas de dos numeros enteros.
 *
 * @author (GINinja)
 * @version (07252019)
 */
public class MiSuma
{
   public static void main(String [] args){
       int a, b, c;
 
      System.out.println("Ingrese dos numeros separados por un espacio para calcular la suma");
      Scanner in = new Scanner(System.in);
     
      a = in.nextInt();
      b = in.nextInt();
      c = a + b;
     
      System.out.println("La suma de los numeros es = " + c);
}
}