package trabajopractico5.programacion2.Ejercicio8;

public class MainEj8 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Laura Fernández", "laura@mail.com");
        FirmaDigital firma = new FirmaDigital("HASH123", "2025-09-25", usuario);
        Documento doc = new Documento("Contrato", "Contenido del contrato...", firma);

        System.out.println("Documento: " + doc.getTitulo() + " firmado por " + firma.getUsuario().getNombre());
    }
}
