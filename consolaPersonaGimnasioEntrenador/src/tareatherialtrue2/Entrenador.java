package tareatherialtrue2;

public class Entrenador extends Persona {

    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void adiestrar(String deportista) {
        System.out.println(getNombre() + " está entrenando a " + deportista);
    }

    public Entrenador(String rut, String nombre, int calorias, String especialidad) {
        super(rut, nombre, calorias);
        this.especialidad = especialidad;
    }

}
