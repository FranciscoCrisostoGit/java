
package herenciaclase;

import java.util.ArrayList;

public class Curso {
        private ArrayList<Alumno> misAlumnos = new ArrayList<Alumno>();
        private ArrayList<Profesor> misProfesores = new ArrayList<Profesor>();
        private String nombreCurso;
        
    public Curso(String nombreCurso){
        this.nombreCurso = nombreCurso;
    }    

    public String getNombreCurso() {
        return nombreCurso;
    }
        
        public boolean incluirAlumno(Alumno elAlumno){
            boolean vOK = true;
            if(elAlumno.getRut().equals("") || elAlumno.getNombre().equals("") )
                vOK = false;
            else
                vOK = true;
            
            String rut = elAlumno.getRut();
             for(Alumno alumnoPaso :misAlumnos){
                 if(alumnoPaso.getRut().equals(rut)) vOK = false;
             }
             
             if(vOK) misAlumnos.add(elAlumno);
        
            return vOK;   
        }
        
        public boolean rajarAlumno(String rut){
            int ind = -1;
            Alumno alumnoPaso;
            
            for(int x=0;x<misAlumnos.size();++x){
                alumnoPaso = misAlumnos.get(x);
                if(alumnoPaso.getRut().equals(rut)) ind = x;
            }
            
            if(ind != -1) misAlumnos.remove(ind);
            
            return (ind != -1);
        }
        
        public int cuantosAlumnos(){
            return misAlumnos.size();
        }
    
}
