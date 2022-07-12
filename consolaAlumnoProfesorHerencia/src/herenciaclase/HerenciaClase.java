
package herenciaclase;

public class HerenciaClase {

    public static void main(String[] args) {
        Alumno estudiante1 = new Alumno("Manuel");
        Alumno estudiante2 = new Alumno("Juanito");
        Profesor profe = new Profesor();
 
        profe.setNombre("Pedro");
       
        estudiante1.irClases();
        estudiante2.irClases();
        profe.irClases();
        
        estudiante1.marcarLibro();
        estudiante2.marcarLibro();
        profe.marcarLibro(); 
    }
    
}
