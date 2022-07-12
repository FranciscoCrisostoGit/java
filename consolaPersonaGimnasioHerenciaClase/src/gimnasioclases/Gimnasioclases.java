
package gimnasioclases;


public class Gimnasioclases {


    public static void main(String[] args) {
        int practicando= 2;
        Deportista humano2; humano2 = new Deportista("futbol","francisco", 50,150);
        Entrenador humano1;  humano1 = new Entrenador("futbol","juan", 75, 50);
        System.out.println(humano1.getNombre());
        System.out.println(humano1.getEspecialidad());
        humano1.adiestrar();
        System.out.println(humano2.getNombre());
        System.out.println("------------------------");
        
        System.out.println(humano2.getNombre());
        System.out.println(humano2.getDeporte());
        humano2.practicar(practicando);
        
        
    }
    
}





