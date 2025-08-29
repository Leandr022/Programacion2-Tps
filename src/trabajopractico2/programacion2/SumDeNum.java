package trabajopractico2.programacion2;

import java.util.Scanner;

public class SumDeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int sumaPares = 0;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scan.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero; // Sumamos solo si es par y distinto de 0
            }

        } while (numero != 0);

        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
