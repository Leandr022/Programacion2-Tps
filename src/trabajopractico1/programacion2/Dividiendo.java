
package trabajopractico1.programacion2;

import java.util.Scanner;

public class Dividiendo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // División con int
        System.out.println("División entera: " + (num1 / num2));

        // División con double
        double num1Double = num1;
        double num2Double = num2;
        System.out.println("División decimal: " + (num1Double / num2Double));

        scanner.close();
    }
}
