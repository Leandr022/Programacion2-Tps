package trabajopractico5.programacion2.Ejercicio13;

public class Asignatura {
    private String nombre;
    private Profesor profesor;
    private Alumno alumno;

    public Asignatura(String álgebra, Profesor profesor, Alumno alumno) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.alumno = alumno;
    }

    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
    public Alumno getAlumno() { return alumno; }
}
