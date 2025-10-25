
package trabajopractico8.programacion2.SistemaEcommerce;

public interface Pago {
    void procesarPago(double monto);
}

public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
}
