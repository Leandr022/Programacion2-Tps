
package trabajopractico2.programacion2;

import java.util.Scanner;

public class CostoEnvioyCompra {

    // Función para calcular costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona inválida. Se asumirá costo 0.");
            return 0;
        }
    }

    // Función para calcular total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scan.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scan.nextDouble();

        scan.nextLine(); // limpiar buffer
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scan.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
}
