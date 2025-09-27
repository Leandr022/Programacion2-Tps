package trabajopractico5.programacion2.Ejercicio10;

public class MainEj10 {
    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("CLV123", "2025-08-01");
        Titular titular = new Titular("Sofía Méndez", "33445566");
        CuentaBancaria cuenta = new CuentaBancaria("123000111000", 50000.0, clave, titular);
        titular.setCuenta(cuenta);

        System.out.println("Titular: " + titular.getNombre() + " - Saldo: " + cuenta.getSaldo());
    }
}

