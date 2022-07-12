package tareatherialtrue2;

public class Deportista extends Persona {

    private String deporte;

    public String getDeporte() {
        return deporte;
    }

    public void practicar(String deporte) {
        System.out.println(getNombre() + " esta practicando " + deporte);
    }

    public Deportista(String rut, String nombre, int calorias, String deporte) {
        super(rut, nombre, calorias);
        this.deporte = deporte;
    }

}
