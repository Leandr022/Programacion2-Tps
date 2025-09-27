package trabajopractico5.programacion2.Ejercicio5;

public class MainEj5 {
    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("ASUS Prime", "Z690");
        Propietario propietario = new Propietario("María López", "99887766");
        Computadora pc = new Computadora("Dell", "SN123456", placa, propietario);
        propietario.setComputadora(pc);

        System.out.println("Propietario: " + propietario.getNombre() + " - Computadora: " + pc.getMarca());
    }
}

