/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author edito
 */
public class TestEmpleado 
{
 
    private static Empleado[]arrEmpleados = new Empleado[10000];
    public static void main(String[] args)
    {
     Jefe j = new Jefe();
        j.setBonoanual(100000);
        j.setBonomensual(40000);
        j.setSueldobase(500000);
        
        arrEmpleados[0] = new Jefe();
        arrEmpleados[0] = new Jefe();
        arrEmpleados[0] = new Jefe();
    }
}
