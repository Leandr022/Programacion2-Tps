package trabajopractico1.programacion2;

import java.util.Scanner;

public class CorregirCodigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // Cambié nextInt() por nextLine()
        System.out.println("Hola, " + nombre);
        scanner.close();
    }
}

