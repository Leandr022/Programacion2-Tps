package trabajopractico5.programacion2.Ejercicio7;

public class MainEj7 {
    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "MTR12345");
        Conductor conductor = new Conductor("Carlos Díaz", "ABC123");
        Vehiculo vehiculo = new Vehiculo("AA123BB", "Toyota Corolla", motor, conductor);
        conductor.setVehiculo(vehiculo);

        System.out.println("Conductor: " + conductor.getNombre() + " - Vehículo: " + vehiculo.getModelo());
    }
}
