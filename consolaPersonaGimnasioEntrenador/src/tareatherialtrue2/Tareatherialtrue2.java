package tareatherialtrue2;

public class Tareatherialtrue2 {

    public static void main(String[] args) {
        Entrenador panchoEntrenador = new Entrenador("19733401-0", "panchoentrenador", 150, "aerobica");
        Deportista panchoDeportista = new Deportista("19733402-0", "panchodeportista", 150, "rugby");
        Gimnasio fuego = new Gimnasio();
//        panchoEntrenador.adiestrar(panchoDeportista.getNombre());
//        panchoDeportista.practicar(panchoDeportista.getDeporte());
        fuego.contrataEntrenador(panchoEntrenador);
       
    }

}
