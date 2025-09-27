package trabajopractico5.programacion2.Ejercicio11;

public class Pedido {
    private final int numeroPedido;
    private final String fecha;
    private final Factura factura;
    private final Cliente cliente;

    public Pedido(int numeroPedido, String fecha, Factura factura, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.fecha = fecha;
        this.factura = factura;
        this.cliente = cliente;
    }

    public int getNumeroPedido() { return numeroPedido; }
    public String getFecha() { return fecha; }
    public Factura getFactura() { return factura; }
    public Cliente getCliente() { return cliente; }

}
