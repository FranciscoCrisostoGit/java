
package herenciaclase;


public  class  Persona {
    private String rut;
    private String nombre;
    private int edad;
    
    public Persona(String rut,String nombre){
       this.rut = rut;this.nombre = nombre;
    }
    
    public String getRut() {
        return rut;
    }
   
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
        System.out.println(nombre + " Está marcando el libro de clase (Persona)");
    }
    
    public void irClases(){
        System.out.println("ir clases de padre(Persona)");
    }  
    

}
