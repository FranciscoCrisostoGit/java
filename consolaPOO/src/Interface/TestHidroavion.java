/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author edito
 */
public class TestHidroavion
{
 private static HidroaviondeCombate[]arrHidro=new HidroaviondeCombate[3];
    public static void main(String[] args) 
    {
        for (int i = 0; i <= 2; i++) 
        {
         arrHidro[i] = new HidroaviondeCombate();
        }
   
    }
}
