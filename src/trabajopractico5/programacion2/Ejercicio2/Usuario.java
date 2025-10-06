package trabajopractico5.programacion2.Ejercicio2;

public class Celular {
    private final String imei;
    private final String marca;
    private final String modelo;
    private final Bateria bateria;
    private Usuario usuario;


    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public Usuario getUsuario() { return usuario; } // ahora compila bien
}
