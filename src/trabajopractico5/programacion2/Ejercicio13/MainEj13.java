package trabajopractico5.programacion2.Ejercicio13;

public class MainEj13 {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Ana Torres", "Matemática");
        Alumno alumno = new Alumno("Luis Romero", 1023);
        Asignatura asignatura = new Asignatura("\u00c1lgebra", profesor, alumno);

        System.out.println("Asignatura: " + asignatura.getNombre() +
                " - Profesor: " + asignatura.getProfesor().getNombre() +
                " - Alumno: " + asignatura.getAlumno().getNombre());
    }
}
