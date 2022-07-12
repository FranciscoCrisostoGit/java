package herenciaclase;

import javax.swing.JOptionPane;

public class HerenciaClase {


    public static void main(String[] args) {
        
        Curso tallerDeProgra = new Curso("Taller de programacion");
        
        Alumno juanito = new Alumno("1-9", "Juanito"); 
        Alumno panchito = new Alumno("2-3", "Francisco"); 
        Alumno otroAlumno = new Alumno("10-8", "Manolito");
        
        if(tallerDeProgra.incluirAlumno(juanito))
            System.out.println("Alumno agregado al curso " + tallerDeProgra.getNombreCurso());
        else
            System.out.println("Alumno no agregado al curso ");
        
        
        tallerDeProgra.incluirAlumno(panchito);
        tallerDeProgra.incluirAlumno(otroAlumno);
        
        System.out.println(tallerDeProgra.cuantosAlumnos());
        
        System.out.println(tallerDeProgra.rajarAlumno("2-3"));
        
        System.out.println(tallerDeProgra.cuantosAlumnos());
        

                                
        

        

        

    }

}
