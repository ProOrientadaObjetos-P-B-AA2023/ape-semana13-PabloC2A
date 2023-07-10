package paquete001;
import paquete002.Ciudad;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private  Ciudad ciudad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String cedula, Ciudad ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.ciudad = ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCedula() {
        return cedula;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return String.format("""
                      *---------- DATOS CLIENTE ----------*
                      -Nombre: %s
                      -Apellido: %s
                      -Edad: %d
                      -Cédula: %s
                      -Ciudad: %s
                      """,
                this.getNombre(),this.getApellido(),
                this.getEdad(),this.getCedula(),
                this.getCiudad().getNombreCiudad());
    }
    
}
