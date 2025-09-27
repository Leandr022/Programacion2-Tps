package trabajopractico5.programacion2.Ejercicio2;

public class Bateria {
    private final String modelo;
    private final int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() { return modelo; }
    public int getCapacidad() { return capacidad; }
}
