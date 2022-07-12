package contraseña;

import com.sun.org.apache.xerces.internal.impl.dv.xs.TypeValidator;
import java.util.Scanner;

public class Contraseña {

    public static void main(String[] args) {
        String nombre;
        String letra;
        String contraseña;
        boolean minuscula = false;
        boolean mayuscula = false;
        boolean numero = false;
        char caracter;
        int min=0;
        int may=0;
        int num=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nombre");
        nombre = sc.next();

        System.out.println("ingrese password");
        contraseña = sc.next();

        if (nombre.length() < 9 || nombre.length() > 15) {
            System.out.println("largo del nombre incorrecto entre 9 y 15 caracteres");
        }

        if (contraseña.toLowerCase().indexOf(nombre.toLowerCase()) > -1) {
            System.out.println("la password no puede contener el nombre");

        }
        for (int i = 0; i < contraseña.length(); i++) {
            caracter = contraseña.charAt(i);
            if ((Character.isDigit(caracter))) {
                num++;
            }
            if ((Character.isLowerCase(caracter))) {
                min++;
            }
            if ((Character.isUpperCase(caracter))) {
                may++;

            }

        }
        if (!((num > 1))){
        System.out.println("necesita tener al menos 2 numeros ");
        }
        if (!((may >= 1))){
        System.out.println("necesita tener al menos una mayuscula ");
        }
        if (!((min >= 1))){
        System.out.println("necesita tener al menos una minuscula ");
        }
    }
}

