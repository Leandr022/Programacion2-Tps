package trabajopractico5.programacion2.Ejercicio14;

public class MainEj14 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Gabriela Soto", "Analista");
        Tarea tarea = new Tarea("Desarrollar módulo de login", "En progreso");
        Proyecto proyecto = new Proyecto("Sistema de Gesti\u00f3n", "2025-09-01", tarea, empleado);

        System.out.println("Proyecto: " + proyecto.getNombre() +
                " - Tarea: " + proyecto.getTarea().getDescripcion() +
                " - Responsable: " + proyecto.getResponsable().getNombre());
    }
}
