package metodomenu;

import java.util.Scanner;


public class Metodomenu {

    public static void main(String[] args) {
    Scanner menu = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        String[] palindromo = new String[10];
        int primo;
        int opc;
        //usar el isLetter para comparar el palindromo
        do {
            System.out.println("Menu");
            System.out.println("Seleccione una opcion");
            System.out.println("1) comprobar si un numero es primo");
            System.out.println("2) comprobar si la frase es palindromo");
            System.out.println("3) para salir");
            System.out.print("Ingrese una opcion: ");
            opc = menu.nextInt();
            if (opc > 3 || opc <= 0) {
                System.out.println("Numero invalido, ingrese nuevamente"); //valida los numeros que esten dentro del rango del menu
                if (Character.isLetter(opc)) {
                    System.out.println("No puede ingresar letras, ingrese un numero");
                }
            }
            switch (opc) {
                case 1:
                    int num;
                    System.out.print("Ingrese numero: ");
                    primo = teclado.nextInt();
                    if (siEsPrimo(primo)) {

                        System.out.println("El numero  " + primo + " es primo");
                    } else {

                        System.out.println("El numero " + primo + " no es primo");
                    }
                    break;
                case 2:
                    String frase;
                    System.out.println("Ingrese frase");
                    frase = leer.nextLine();
                    if (palindromo(frase)) {
                        System.out.println(frase + " Frase es palindromo");
                    } else {
                        System.out.println(frase + " Frase no es palindromo");
                    }

                    break;
                case 3:
                    System.out.println("Usted ha salido del menu, Gracias por interactuar");

            }
        } while (opc != 3);

    }

    private static boolean siEsPrimo(int num) {
        int cont = 0;

        for (int x = 1; x <= num; ++x) {
            if (num % x == 0) {
                ++cont;
            }
        }

        if (cont == 2) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean palindromo(String frase) {
        String fraseReves = "";
        String nuevafrase="";
        boolean letra = false;
        for (int i = 0; i < frase.length(); i++) {
            char x = frase.charAt(i);
            if(Character.isLetter(x)){
                letra = true;
                String temp = Character.toString(x);
                nuevafrase= nuevafrase+temp;
                
            } 
            if(letra==false){
                String reemp = Character.toString(x);
                frase.replaceAll(reemp, "");
            }
            
        }
        
        frase = nuevafrase;


        for (int x = frase.length() - 1; x >= 0; --x) {
            fraseReves = fraseReves + frase.charAt(x);           
        }        

        if (frase.equals(fraseReves)) {
            System.out.println("Palindromo");
        } else {
            System.out.println("No es palindromo");
        }
        if (frase.equals(fraseReves)) {
            return true;
        } else {
            return false;
        }

    }
    
}
