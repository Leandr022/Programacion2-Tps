package trabajopractico5.programacion2.Ejercicio4;

public class MainEj4 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Luis Rodríguez", "11223344");
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "12/28", cliente, banco);
        cliente.setTarjeta(tarjeta);

        System.out.println("Cliente: " + cliente.getNombre() + " - Banco: " + banco.getNombre());
    }
}
