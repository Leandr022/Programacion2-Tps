package trabajopractico5.programacion2.Ejercicio5;

public class Computadora {
    private final String marca;
    private final String numeroSerie;
    private final PlacaMadre placaMadre;
    private final Propietario propietario;

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
        this.propietario = propietario;
    }

    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }
}

