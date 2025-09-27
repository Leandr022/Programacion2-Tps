package trabajopractico5.programacion2.Ejercicio12;

public class MainEj12 {
    public static void main(String[] args) {
        Actor actor = new Actor("Leonardo DiCaprio", 50);
        Director director = new Director("Christopher Nolan", "Británico");
        Pelicula peli = new Pelicula("Origen", 2010, actor, director);

        System.out.println("Película: " + peli.getTitulo() +
                " - Actor principal: " + peli.getActorPrincipal().getNombre() +
                " - Director: " + peli.getDirector().getNombre());
    }
}
