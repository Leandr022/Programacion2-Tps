package trabajopractico5.programacion2.Ejercicio10;

public class CuentaBancaria {
    private final String cbu;
    private final double saldo;
    private final ClaveSeguridad clave;
    private final Titular titular;

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
    }

    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClave() { return clave; }
    public Titular getTitular() { return titular; }
}
