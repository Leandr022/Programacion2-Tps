package trabajopractico5.programacion2.Ejercicio7;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() { return vehiculo; }
    public String getNombre() { return nombre; }
    public String getLicencia() { return licencia; }
}
