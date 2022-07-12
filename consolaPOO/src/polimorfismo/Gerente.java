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
public class Gerente extends Empleado
{
    private int bonanual,bonmensual,bonsemestral;
    
    
    public int calcularsueldo()
    {
        return(this.bonanual+this.bonanual/12 + this.bonsemestral/6 + sueldobase);
    }
}
