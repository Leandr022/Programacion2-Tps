
package trabajopractico2.programacion2;

import java.util.Scanner;

public class MayorDe3Num{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scan.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scan.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scan.nextInt();

        int mayor = num1; // asumimos que el primero es el mayor

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El mayor es: " + mayor);
    }
}
