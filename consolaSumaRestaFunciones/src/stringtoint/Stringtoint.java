package stringtoint;

import java.util.Scanner;

public class Stringtoint {

    public static void main(String[] args) {
        int seleccion;
        int primero;
        int segundo;
        
        System.out.println("menu");
        System.out.println("seleccione");
        System.out.println("1)sumar 2 numeros");
        System.out.println("2)restar 2 numeros");
        Scanner teclado = new Scanner(System.in);
        Scanner primer = new Scanner (System.in);
        Scanner segun = new Scanner (System.in);
        seleccion = teclado.nextInt();

        switch(seleccion){
        
            case 1:
                System.out.println("ingrese primer numero");
                primero = primer.nextInt();
                System.out.println("ingrese segundo numero");
                segundo = primer.nextInt();
            
        
        
        }
                    
        
        
        
//        menu 
//       sumar 2 numeros
//       restar 2 numeros
//       3 salir
//       
//       ingresa numero 1 
//       ingresa numero 2 
//       
//       resultado 
//        
//        
    }
    
    private  static  int    sumados (int     num1     ,int    num2){ 
//   siempre siempre retorno nombre   ingreso nombre , ingreso nombre
    int s;
    s= num1 + num2;
    return s;
        
    }
    
    private static int restados (int num1,int num2) {
    int s;
    s= num1 - num2;
    return s;
    
    
    }
    
    
    
}
