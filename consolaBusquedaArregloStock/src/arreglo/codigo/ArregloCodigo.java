package arreglo.codigo;

import java.util.Arrays;

import java.util.Scanner;

public class ArregloCodigo {

    public static void main(String[] args) {

        String[] producto = new String[10];
        int[][] stock = new int[10][2];
        producto[0] = "lapiz";
        producto[1] = "goma";
        producto[2] = "sacapuntas";
        producto[3] = "corrector";
        producto[4] = "pizarra";
        producto[5] = "borrador";
        producto[6] = "estuche";
        producto[7] = "tijeras";
        producto[8] = "mochila";
        producto[9] = "bolso";

        stock[0][0] = 1000;//codigo lapiz
        stock[0][1] = 20;//stock lapiz
        stock[1][0] = 1001;//codigo goma
        stock[1][1] = 19;//stock goma
        stock[2][0] = 1002;//codigo sacapuntas
        stock[2][1] = 18;//stock sacapuntas
        stock[3][0] = 1003;//codigo corrector
        stock[3][1] = 17;//stock corrector
        stock[4][0] = 1004;//codigo pizarra
        stock[4][1] = 16;//stock pizarra
        stock[5][0] = 1005;//codigo borrador
        stock[5][1] = 15;//stock borrador
        stock[6][0] = 1006;//codigo estuche
        stock[6][1] = 14;//stock estuche
        stock[7][0] = 1007;//codigo tijeras
        stock[7][1] = 13;//stock tijeras
        stock[8][0] = 1008;//codigo mochila
        stock[8][1] = 12;//stock mochila
        stock[9][0] = 1009;//codigo bolso
        stock[9][1] = 11;//stock bolso

        System.out.println(Arrays.toString(producto));
        System.out.println(Arrays.deepToString(stock));

        

            int seleccion;
            int codigo;
            String descripcion;

            Scanner selec = new Scanner(System.in);
            Scanner cod = new Scanner(System.in);
            Scanner desc = new Scanner(System.in);

            do {
                System.out.println("menu seleccione operacion");
                System.out.println("1 buscar por codigo");
                System.out.println("2 buscar por descripcion");
                System.out.println("3 salir");
                seleccion = selec.nextInt();
                switch (seleccion) {
                    case 1:

                        System.out.println("ingrese codigo a buscar (sugerencia: entre 1000 y 1009)");
                        codigo = cod.nextInt();
                        for (int i = 0; i < 10; ++i) {
                            if (stock[i][0] == codigo) {
                                System.out.println("producto: " + producto[i]);
                                System.out.println("stock: " + stock[i][1]);
                            }

                        }
                        break;
                    case 2:
                        System.out.println("ingrese descripcion a buscar (sugerencia: no mas de 10 caracteres)");
                        descripcion = desc.nextLine();
                        for (int i = 0; i < 10; i++) {
                            if (producto[i].contains(descripcion.toLowerCase())) {
                                System.out.println("producto:" + producto[i] + "/" + " codigo:" + stock[i][0] + "/" + " stock:" + stock[i][1]);

                            }
                        }
                        break;

                        
                
                    default:
                         System.out.println("ingrese una opcion correcta");
                }

        } while (!(seleccion == 3));

                System.out.println("adios");
        
                
                
            
                
            

    
    
    }
}