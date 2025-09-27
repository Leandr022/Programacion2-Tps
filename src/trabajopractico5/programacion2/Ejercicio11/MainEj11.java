package trabajopractico5.programacion2.Ejercicio11;

public class MainEj11 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "1155667788");
        Factura factura = new Factura(101, 1500.75, "2025-09-26");
        Pedido pedido = new Pedido(1, "2025-09-25", factura, cliente);

        System.out.println(pedido.getFactura().getMonto() + " - Monto: $" +
                "Cliente: " + pedido.getCliente().getNombre() +
                " - Factura N° " + pedido.getFactura().getNumeroFactura());
    }
}
