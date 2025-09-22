
package trabajopractico3.programacion2;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion); // uso del setter para validar
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    // Setter con validación
    public void setAñoPublicacion(int año) {
        if (año > 0 && año <= 2025) {
            this.añoPublicacion = año;
        } else {
            System.out.println("Año inválido, no se modificó.");
        }
    }
}
