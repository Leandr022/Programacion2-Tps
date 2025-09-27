
package trabajopractico5.programacion2.Ejercicio1;

public class Pasaporte {
    private final String numero;
    private final String fechaEmision;
    private final Foto foto;
    private final Titular titular;

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
    }

    public String getNumero() { return numero; }
    public String getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }
}
