/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescritura;

/**
 *
 * @author edito
 */
public  abstract class Animal 
{
 protected String nombre;
 protected float peso ;
 protected int edad;
 public Animal()
 {
     this.edad = 0;
     this.nombre = "";
     this.peso = 0.0F;
 }
 
 
 
 public void comer(){
    System.out.println("el animal come");
 
}
 
}
