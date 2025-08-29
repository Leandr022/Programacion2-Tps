
package trabajopractico2.programacion2;

public class BusquedaLinealyBinaria {

    // Búsqueda Lineal
    public static int busquedaLineal(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i; // devuelve la posición donde se encontró
            }
        }
        return -1; // no encontrado
    }

    // Búsqueda Binaria (requiere arreglo ordenado)
    public static int busquedaBinaria(int[] arr, int valor) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arr[medio] == valor) {
                return medio;
            } else if (arr[medio] < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1; // no encontrado
    }

    public static void main(String[] args) {
        int[] numeros = {5, 12, 23, 34, 45, 56, 67, 78};
        
        int buscado = 45;

        System.out.println("Búsqueda Lineal de " + buscado + ": posición " + busquedaLineal(numeros, buscado));
        System.out.println("Búsqueda Binaria de " + buscado + ": posición " + busquedaBinaria(numeros, buscado));
    }
}
