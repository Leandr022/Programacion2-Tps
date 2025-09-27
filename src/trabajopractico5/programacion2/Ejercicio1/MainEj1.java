package trabajopractico5.programacion2.Ejercicio1;

public class MainEj1 {
    public static void main(String[] args) {
        Foto foto = new Foto("foto.png", "png");
        Titular titular = new Titular("Juan Pérez", "12345678");
        Pasaporte pasaporte = new Pasaporte("A12345", "2025-01-01", foto, titular);
        titular.setPasaporte(pasaporte);

        System.out.println("Titular: " + titular.getNombre() + " - Pasaporte: " + pasaporte.getNumero());
    }
}
