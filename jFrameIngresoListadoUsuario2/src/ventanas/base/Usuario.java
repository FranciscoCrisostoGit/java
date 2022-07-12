package ventanas.base;

public class Usuario
{
    private String nombre, apellido;
    private short  edad;
    private char   sexo;
    
    public Usuario()
    {
        this.nombre = "(sin nombre)";
        this.apellido="(sin apellido)";
        this.edad   = 1;
        this.sexo   = 'I';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}
