package trabajopractico5.programacion2.Ejercicio7;

public class Vehiculo {
    private final String patente;
    private final String modelo;
    private final Motor motor;
    private final Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
    }

    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }
}
