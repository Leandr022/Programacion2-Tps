package trabajopractico5.programacion2.Ejercicio6;

public class MainEj6 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro García", "1122334455");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-10-01", "20:00", cliente, mesa);

        System.out.println("Reserva para " + reserva.getCliente().getNombre() + " en mesa " + reserva.getMesa().getNumero());
    }
}

