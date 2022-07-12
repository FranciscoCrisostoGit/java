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
public class Obrero extends Empleado
{
  private  int bonanual;
  public int calcularsueldo()
  {
      return(this.bonanual/12 + this.sueldobase);
  }

    public int getBonanual() {
        return bonanual;
    }

    public void setBonanual(int bonanual) {
        this.bonanual = bonanual;
    }
  
}
