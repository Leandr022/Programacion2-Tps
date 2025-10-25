
package trabajopractico8.programacion2.SistemaEcommerce;

public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: $" + monto);
    }
}