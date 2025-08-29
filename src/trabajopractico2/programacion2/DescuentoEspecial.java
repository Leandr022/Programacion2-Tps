
package trabajopractico2.programacion2;


import java.util.Scanner;

public class DescuentoEspecial {

    // Variable global (constante)
    static double descuento_especial = 0.10;

    // Función que calcula descuento especial
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuento_especial;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        calcularDescuentoEspecial(precio);
    }
}

