package trabajopractico5.programacion2.Ejercicio2;

public class Usuario {
    private final String nombre;
    private final String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public Celular getCelular() { return celular; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}
