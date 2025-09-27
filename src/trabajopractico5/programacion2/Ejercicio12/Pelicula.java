package trabajopractico5.programacion2.Ejercicio12;

public class Pelicula {
    private String titulo;
    private int anio;
    private Actor actorPrincipal;
    private Director director;

    public Pelicula(String origen, int par, Actor actor, Director director) {
        this.titulo = titulo;
        this.anio = anio;
        this.actorPrincipal = actorPrincipal;
        this.director = director;
    }

    public String getTitulo() { return titulo; }
    public int getAnio() { return anio; }
    public Actor getActorPrincipal() { return actorPrincipal; }
    public Director getDirector() { return director; }
}
