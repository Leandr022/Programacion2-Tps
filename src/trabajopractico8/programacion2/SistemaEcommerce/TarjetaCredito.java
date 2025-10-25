
package trabajopractico8.programacion2.SistemaEcommerce;

public class TarjetaCredito implements PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        double totalConDescuento = monto * 0.9; // 10% de descuento
        System.out.println("Monto con descuento aplicado: $" + totalConDescuento);
        return totalConDescuento;
    }
}

