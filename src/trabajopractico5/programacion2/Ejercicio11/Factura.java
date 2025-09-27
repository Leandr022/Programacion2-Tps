package trabajopractico5.programacion2.Ejercicio11;

public class Factura {
    private int numeroFactura;
    private double monto;
    private String fecha;

    public Factura(int numeroFactura, double monto, String fecha) {
        this.numeroFactura = numeroFactura;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getNumeroFactura() { return numeroFactura; }
    public double getMonto() { return monto; }
    public String getFecha() { return fecha; }
}
