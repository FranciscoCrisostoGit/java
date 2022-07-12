package menu;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int seleccion;
        int primero;
        int segundo;
        int resultado;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("menu seleccione operacion");
            System.out.println("1 suma");
            System.out.println("2 resta");
            System.out.println("3 salir");
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1:

                    System.out.println("ingrese primer numero");
                    primero = sc.nextInt();
                    System.out.println("ingrese segundo numero");
                    segundo = sc.nextInt();
                    resultado = primero + segundo;
                    System.out.println("el resultado señor es:" + resultado);
                    break;
                case 2:

                    System.out.println("ingrese primer numero");
                    primero = sc.nextInt();
                    System.out.println("ingrese segundo numero");
                    segundo = sc.nextInt();
                    resultado = primero - segundo;
                    System.out.println("el resultado es:" + resultado);
                    break;

                default:
                    System.out.println("ingrese una opcion correcta");
            }

        } while (seleccion < 3);

        System.out.println("gracias feo culiao , te vay altoke");

    }

}
