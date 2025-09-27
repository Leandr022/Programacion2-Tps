package trabajopractico5.programacion2.Ejercicio14;

public class Proyecto {
    private String nombre;
    private String fechaInicio;
    private Tarea tarea;
    private Empleado responsable;

    public Proyecto(String sistema_de_Gestión, String string, Tarea tarea, Empleado empleado) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.tarea = tarea;
        this.responsable = responsable;
    }

    public String getNombre() { return nombre; }
    public String getFechaInicio() { return fechaInicio; }
    public Tarea getTarea() { return tarea; }
    public Empleado getResponsable() { return responsable; }
}
