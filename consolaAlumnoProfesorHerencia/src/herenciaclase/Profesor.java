
package herenciaclase;

//Profesor hereda de Persona y recibe todos sus metodos
public class Profesor extends Persona {
    //Atributo matricula es solo del alumno
    private String contrato;

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    
     //Método sobrescrito, existe en la clase padre pero lo sobrescribimos 
    //para que se invoque este y no el del padre
    @Override
    public void irClases(){
        //getNombre() es un método heredado del padre Persona
        System.out.println(getNombre() + " va a enseñar a sus alumnos aplicados y estudiosos");
    }
    
}
