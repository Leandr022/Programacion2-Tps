package trabajopractico6.programacion2.CasoPractico2;

public class MainBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca("Biblioteca Nacional");

        // Autores
        Autor a1 = new Autor("A01", "Jorge Luis Borges", "Argentina");
        Autor a2 = new Autor("A02", "Gabriel García Márquez", "Colombia");
        Autor a3 = new Autor("A03", "Julio Cortázar", "Argentina");

        // Libros
        biblio.agregarLibro("L001", "El Aleph", 1949, a1);
        biblio.agregarLibro("L002", "Ficciones", 1944, a1);
        biblio.agregarLibro("L003", "Cien años de soledad", 1967, a2);
        biblio.agregarLibro("L004", "Rayuela", 1963, a3);
        biblio.agregarLibro("L005", "El coronel no tiene quien le escriba", 1961, a2);

        // 4 Listar
        biblio.listarLibros();

        // 5 Buscar
        System.out.println("\n🔍 Buscando L003:");
        Libro encontrado = biblio.buscarLibroPorIsbn("L003");
        if (encontrado != null) encontrado.mostrarInfo();

        // 6 Filtrar
        biblio.filtrarLibrosPorAnio(1963);

        // 7 Eliminar
        biblio.eliminarLibro("L001");
        biblio.listarLibros();

        // 8 Cantidad total
        System.out.println("\n📦 Total de libros: " + biblio.obtenerCantidadLibros());

        // 9 Mostrar autores
        biblio.mostrarAutoresDisponibles();
    }
}
