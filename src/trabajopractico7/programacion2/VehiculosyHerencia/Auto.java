
package trabajopractico7.programacion2.VehiculosyHerencia;


public class Auto extends Vehiculo {
    private int cantidadDePuertas;

    public Auto(String marca, String modelo, int cantidadDePuertas) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: " + cantidadDePuertas);
    }
}