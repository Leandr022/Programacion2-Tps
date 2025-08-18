package trabajopractico1.programacion2;

import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Nombre ingresado: " + nombre);
        System.out.println("Edad ingresada: " + edad);

        scanner.close();
    }
}
