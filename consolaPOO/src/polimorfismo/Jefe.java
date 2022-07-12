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
public class Jefe extends Empleado
{
 private int bonoanual;
 private int bonomensual;
  
 
 public int calcularsueldo()
 {
     return (this.bonoanual/12 + this.bonomensual + this.sueldobase);
 }

    public int getBonoanual() {
        return bonoanual;
    }

    public void setBonoanual(int bonoanual) {
        this.bonoanual = bonoanual;
    }

    public int getBonomensual() {
        return bonomensual;
    }

    public void setBonomensual(int bonomensual) {
        this.bonomensual = bonomensual;
    }
 
}
