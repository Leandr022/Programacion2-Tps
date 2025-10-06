package trabajopractico5.programacion2.Ejercicio2;

public class MainEj2 {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana Gómez", "87654321");
        Bateria bateria = new Bateria("BTX-5000", 4000);
        Celular celular = new Celular("Samsung", "A52", "123456789012345", bateria);
        usuario.setCelular(celular);
        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Batería: " + celular.getBateria().getModelo());
    }
    
}
