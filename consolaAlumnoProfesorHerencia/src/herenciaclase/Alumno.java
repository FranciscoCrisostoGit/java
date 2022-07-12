
package herenciaclase;

//Alumno hereda de Persona y recibe todos sus metodos
public class Alumno extends Persona {
    //Atributo matricula es solo del alumno
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Constructor de la clase que recibe el nombre para que cuando la instancien
    //pueda tener el nombre sin invocar setNombre()
    public Alumno(String nombre){
        //Método heredado de la clase padre Persona
        setNombre(nombre);
    }
    
    //Constructor vacio para que puedan crear objetos sin valor en sus atributos
    public Alumno(){}
    
    
    //Método sobrescrito, existe en la clase padre pero lo sobrescribimos 
    //para que se invoque este y no el del padre
    @Override
    public void irClases(){
        System.out.println(getNombre() + " va a aprende java con el profesor (desde la clase alumno)");
    }
   
    
}
