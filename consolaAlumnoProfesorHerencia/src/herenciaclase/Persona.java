
package herenciaclase;


public  class  Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void marcarLibro(){
        System.out.println(nombre + " Está marcando el libro de clases en la clase Persona");
    }
    
    public void irClases(){
        System.out.println("ir clases de padre(Persona)");
    }  
    

}
