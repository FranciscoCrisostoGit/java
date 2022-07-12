
package tareatherialtrue2;

import java.util.ArrayList;

public class Gimnasio {
    
        private ArrayList<Deportista> deportistas = new ArrayList<Deportista>();
        private ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();


    public ArrayList<Deportista> getDeportistas() {
        return deportistas;
    }

    public void setDeportistas(ArrayList<Deportista> deportistas) {
        this.deportistas = deportistas;
    }

    public ArrayList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(ArrayList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }


     public boolean contrataEntrenador(Entrenador elEntrenador){
        boolean vok = true;
            if(elEntrenador.getRut().equals("") || elEntrenador.getNombre().equals("") )
                vok = false;
            else
                vok = true;
            
            String rut = elEntrenador.getRut();
             for(Entrenador contratando :entrenadores){
                 if(contratando.getRut().equals(rut)) vok = false;
             }
             
             if(vok) entrenadores.add(elEntrenador);
        
            return vok; 
         }
     
     public boolean despideEntrenador(String rut){
            int ind = -1;
            Entrenador contratando;
            
            for(int x=0;x<entrenadores.size();++x){
                contratando = entrenadores.get(x);
                if(contratando.getRut().equals(rut)) ind = x;
            }
            
            if(ind != -1) entrenadores.remove(ind);
            
            return (ind != -1);
        }

          public boolean agregaDeportista(Deportista elDeportista){
        boolean vok = true;
            if(elDeportista.getRut().equals("") || elDeportista.getNombre().equals("") )
                vok = false;
            else
                vok = true;
            
            String rut = elDeportista.getRut();
             for(Deportista agregando :deportistas){
                 if(agregando.getRut().equals(rut)) vok = false;
             }
             
             if(vok) deportistas.add(elDeportista);
        
            return vok; 
         }
          
     public boolean eliminaDeportista(String rut){
            int ind = -1;
            Deportista eliminando;
            
            for(int x=0;x<deportistas.size();++x){
                eliminando = deportistas.get(x);
                if(eliminando.getRut().equals(rut)) ind = x;
            }
            
            if(ind != -1) deportistas.remove(ind);
            
            return (ind != -1);
        }
     
     public ArrayList<Entrenador> arrayEntrenadores() {
     return entrenadores;

}
             
     public ArrayList<Deportista> arrayDeportistas() {

     return deportistas;
}
           
}
