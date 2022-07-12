
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
    public Alumno(String rut,String nombre){
        //Método heredado de la clase padre Persona
        super(rut,nombre);
    } 

    //Método sobrescrito, existe en la clase padre pero lo sobrescribimos 
    //para que se invoque este y no el del padre
    @Override
    public void irClases(){
        System.out.println(getNombre() + " va aprender super java con el profe wuena onda de la U");
    }
   
    
}
