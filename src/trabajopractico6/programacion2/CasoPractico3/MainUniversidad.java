package trabajopractico6.programacion2.CasoPractico3;

public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        Profesor p1 = new Profesor("P01", "Carlos Ruiz", "Programación");
        Profesor p2 = new Profesor("P02", "Ana Pérez", "Matemática");
        Profesor p3 = new Profesor("P03", "Luis Gómez", "Base de Datos");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        Curso c1 = new Curso("C01", "Programación I");
        Curso c2 = new Curso("C02", "Álgebra");
        Curso c3 = new Curso("C03", "SQL");
        Curso c4 = new Curso("C04", "Estructuras de Datos");
        Curso c5 = new Curso("C05", "Lógica");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C01", "P01");
        uni.asignarProfesorACurso("C04", "P01");
        uni.asignarProfesorACurso("C02", "P02");
        uni.asignarProfesorACurso("C05", "P03");

        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("\n Cambiando profesor de un curso...");
        uni.asignarProfesorACurso("C05", "P02");
        uni.eliminarCurso("C04");
        uni.eliminarProfesor("P03");
        uni.reporteCursosPorProfesor();
    }
}
