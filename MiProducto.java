import java.util.Scanner;
/**
 * Herramienta para calcular el producto de dos enteros.
 *
 * @author (GINinja)
 * @version (a version number or a date)
 */
public class MiProducto
{
      public static void main(String args[])
   {
      int a, b, c;
 
      System.out.println("Ingrese dos numeros separados por un espacio para calcular su producto");
      Scanner in = new Scanner(System.in);
     
      a = in.nextInt();
      b = in.nextInt();
      c = a * b;
     
      System.out.println("El producto de los numeros es = " + c); 
}
}