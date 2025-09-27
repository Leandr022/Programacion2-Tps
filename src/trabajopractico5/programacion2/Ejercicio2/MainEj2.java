package trabajopractico5.programacion2.Ejercicio2;

public class MainEj2 {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("BTR-5000", 4000);
        Usuario usuario = new Usuario("Ana Gómez", "98765432");
        Celular celular = new Celular("1234567890", "Samsung", "S22", bateria, usuario);
        usuario.setCelular(celular);

        System.out.println("Usuario: " + usuario.getNombre() + " - Celular: " + celular.getMarca());
    }
}
