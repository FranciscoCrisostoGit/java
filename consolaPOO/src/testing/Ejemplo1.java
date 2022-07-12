
package testing;
import java.util.*;

/**
 *
 * @author edito
 */
public class Ejemplo1
{
    public static void main(String[] args) 
    {
        int a = 0,b= 0;
        
        try
        {
            Scanner sc =new Scanner(System.in);
            
            System.out.print("a = ");
            a = sc.nextInt();
            System.out.print("b = ");
            b = sc.nextInt();
        
        }
        catch(Exception e )
//        catch(InputMismatchException e )
//                
        {
                    System.out.println("Excepcion : se esperaba un numero entero");
                    return;
                }
         try
         {
        System.out.println("a / b = " + a/b);
         }
         catch(ArithmeticException e)
         {
             System.out.println("no se puede dividir por cero");
             
         }
    }
}
