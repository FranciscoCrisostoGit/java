/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pancho Crisosto
 */
public class Prueba01 {

   
    public static void main(String[] args) {
        
        String[] auxiliar = new String[10];
        auxiliar[0] = "16.125.690-0;CLAUDIO ANTONIO HONORATO DE LA FUENTE;240000;PJE. ESTERO AZUL N 1742";
        auxiliar[1] = "16.107.855-7;BARBARA FABIOLA DELGADO SANCHEZ;216800;PJE. SCHEAT 8587 - VILLA ESTRELLA SUR";
        auxiliar[2] = "16.082.439-5;PABLO ANDRES HENRIQUEZ LEON;353657;AURORA 8964";
        auxiliar[3] = "16.030.010-8;JORGE ARIEL CARTES JARA;478604;AMUNATEGUI N 630 BARRIO STA ANA";
        auxiliar[4] = "15.822.860-2;CESAR ALEJANDRO LIGUENO ROJAS;901209;CATEDRAL 1450 DPTO 108";
        auxiliar[5] = "15.798.385-7;JUAN PABLO ESCANILLA CORREA;525000;HERALDICA 8861";
        auxiliar[6] = "15.797.263-4;DOMINGO HERNAN DIAZ MORALES;380000;AV. FRESIA 2375";
        auxiliar[7] = "15.775.088-7;NICOLAS BENJAMIN ANDAUR MOREIRA;240000;SAN IGNACIO 268 PJE. INTERIOR 2 - CASA 191";
        auxiliar[8] = "15.767.949-K;BEATRIZ IDAMIA ORTIZ CESPEDES;1250000;PSJE SAN MARTIN 958";
        auxiliar[9] = "15.754.871-9;CHRISTOPHER JONATHAN OLGUIN ALVARADO;755000;LA LLARETA 9073";
        Scanner selec = new Scanner(System.in);
        Scanner rutsc = new Scanner(System.in);
        Scanner com = new Scanner(System.in);
        Scanner fin = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        String[][]datos = new String [10][4];
        String[]paso = new String [4];
        String rut;
        int desde;int hasta;
        String nombre;
        
        for (int i = 0; i < 10; i++) {
            
            paso = auxiliar[i].split(";");
            datos[i][0] = paso[0];
            datos[i][1] = paso[1];
            datos[i][2] = paso[2];
            datos[i][3] = paso[3];
        }
        
        System.out.println(Arrays.toString(paso));
        System.out.println(Arrays.deepToString(datos));
        
        int seleccion;

        do {
            System.out.println("menu seleccione operacion");
            System.out.println("1.- buscar rut");
            System.out.println("2.- buscar por nombre");
            System.out.println("3.- lista por rango de sueldos");
            System.out.println("4.- salir");
            seleccion = selec.nextInt();
            switch (seleccion) {
                case 1:
                    System.out.print("ingrese rut a buscar-->");
                    rut = rutsc.nextLine();
                    for (int i = 0; i < 10; i++) {
                        if (rut.equals(datos[i][0])) {
                            System.out.println(" ");
                            System.out.println("rut       :" + datos[i][0]);
                            System.out.println("nombre    :" + datos[i][1]);
                            System.out.println("sueldo    :" + datos[i][2]);
                            System.out.println("direccion :" + datos[i][3]);  
                            break;
                        }
                        
                        
                    }
                    System.out.println("¡¡¡...Rut Inexistente...!!!");

                    break;
                case 2:
//
                     System.out.println("ingrese nombre a buscar");
                     nombre = nom.nextLine();
                     System.out.println(Arrays.toString(Prueba01.buscar(nombre,datos)));
                     
//                    primero = sc.nextInt();
//                    System.out.println("ingrese segundo numero");
//                    segundo = sc.nextInt();
//                    resultado = primero - segundo;
//                    System.out.println("el resultado señor es:" + resultado);
                    break;
                
                    
                case 3:
                      
                      System.out.println("ingrese desde que sueldo desea listar");
                      desde = com.nextInt();
                      System.out.println("Hasta que sueldo");
                      hasta = fin.nextInt();
                      int dato;int cont=0;
                      System.out.println("listado de personas con sueldo "+ desde + " y " + hasta);
                      for (int i = 0; i < 10; i++) {
                          dato = Integer.parseInt(datos[i][2]);
                          
                          if((dato > desde)&&(dato < hasta)){
                              cont = cont+1;
                              System.out.println("nombre : "+ datos[i][1] + ", sueldo : " + datos[i][2]);
                          }  
                     
                    
                        }
                          if(cont==0){
                              System.out.println("no se encontraron resultados");
                          
                          }
                    break;
                    
                case 4: System.out.println("hasta pronto");
                    
                    break;
                    
                default:
                    System.out.println("ingrese una opcion correcta");
            }

        } while (seleccion < 4);

        System.out.println("gracias por interactuar");

    }
    
 public static String[] buscar(String busq,String[][] lista){    
     String[] busqueda = new String[10];
     int cont = 0;
     for (int i = 0; i < 10; i++) {
         if(busq.contains(lista[i][1])){
            busqueda[cont] = lista[i][0] + ";" + lista [i][1];
            cont = cont + 1;
            
         }       
     }
     String[] busquedab = new String[cont+1];
     for (int i = 0; i < 10; i++) {
         busquedab[i]=busqueda[i];
         
     }
     
     return busquedab;
 }
}

 

    
        
  
    
    


