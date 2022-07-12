
package conversor;

import java.util.Scanner;

public class Conversor {

  
    public static void main(String[] args) {
        float preciodolar;
        int seleccion;
        
        System.out.println("|||||||Bienvenido al sistema conversor de dolares|||||||||");
        System.out.print("Para un calculo mas preciso, ingrese el valor del dolar actual -> ");
        Scanner precio = new Scanner(System.in);
        preciodolar = precio.nextFloat();
    do{    
                
        System.out.println("|||||||||||||Menu Principal|||||||||||||||");
        System.out.println("1)convertir de dolar a pesos");
        System.out.println("2)convertir de pesos a dolar");
        System.out.println("3)salir");
        System.out.print("seleccione opcion -> ");
        Scanner selecmenu = new Scanner(System.in);
        seleccion = selecmenu.nextInt();
        
        switch ( seleccion) {
            case 1: System.out.print("ingrese cantidad de dolares: ");
                    float cantdolar;
                    Scanner ingdolar = new Scanner(System.in);
                    cantdolar = ingdolar.nextFloat();
                    System.out.println("el total en pesos es: " + Conversor.dap(cantdolar, preciodolar));
                break;
                    
            case 2: System.out.print("ingrese cantidad de pesos:");
                    float cantpesos;
                    Scanner ingpesos = new Scanner(System.in);
                    cantpesos = ingpesos.nextFloat();
                    System.out.println("el total en dolares es: " + Conversor.pad(cantpesos, preciodolar));
               
                   
                break;
                
            case 3:System.out.println("Hasta Luego");
                
                break;
                
            default:
                System.out.println("Error: ingrese una opcion correcta");
                
            
                break;
        }
        
    
    }while(!(seleccion == 3));
    
        System.out.println("Considere utilizar esta aplicacion en un futuro");
 
    }
    
    
    
    
    
    
    private  static  int dap (float cantdolar, float precdolar ) { 
    

    return Math.round(cantdolar * precdolar);

} 
    
    
     private  static  float  pad (float cantpesos, float precdolar ) { 

    return Math.round(cantpesos/precdolar);

}    
    
    
    
}

