
package trabajopractico5.programacion2.ejercicio3;

public class MainEj3 {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Planeta", "Av. Siempre Viva 123");
        Libro libro = new Libro("Cien años de soledad", "978-3-16-148410-0", autor, editorial);

        System.out.println("Libro: " + libro.getTitulo() + " - Autor: " + libro.getAutor().getNombre());
    }
}

