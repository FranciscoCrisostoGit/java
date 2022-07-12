package gimnasioclases;

public class Persona {

    private String nombre;
    private float peso;
    private int calorias;

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public Persona(String nombre, float peso, int calorias) {

        if (nombre == "") {
            nombre = "nombre no ingresado";
        }
        if (peso < 0) {
            peso = peso * -1;
        }
        if (calorias < 1) {
            calorias = 1;
        }

        this.nombre = nombre;
        this.peso = peso;
        this.calorias = calorias;
    }

}

class Entrenador extends Persona {

    private String especialidad;

    public void adiestrar() {

        System.out.println("está entrenando a ");

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Entrenador(String especialidad, String nombre, float peso, int calorias) {
        super(nombre, peso, calorias);
        if (especialidad.equalsIgnoreCase("")) {
            especialidad = "especialidad no ingresada";

        }
        this.especialidad = especialidad;
    }

}

class Deportista extends Persona {

    private String deporte;

    public Deportista(String deporte, String nombre, float peso, int calorias) {
        super(nombre, peso, calorias);
        this.deporte = deporte;
    }


    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void practicar(int tiempo) {
        if (tiempo < 0) {
            tiempo = tiempo * -1;
        }
        int caloriasmenos = tiempo * 5;

        System.out.println("calorias quemadas " + caloriasmenos);
    }
}
