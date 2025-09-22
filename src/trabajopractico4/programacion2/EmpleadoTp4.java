package trabajopractico4.programacion2;

public class EmpleadoTp4 {
    // 🔹 Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // 🔹 Atributo estático: contador global
    private static int totalEmpleados = 0;
    private static int siguienteId = 1; // para asignar ids automáticos

    // 🔹 Constructor 1: recibe todos los atributos
    public EmpleadoTp4(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // 🔹 Constructor 2: recibe solo nombre y puesto
    public EmpleadoTp4(String nombre, String puesto) {
        this.id = siguienteId++;       // asigna id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0;         // salario por defecto
        totalEmpleados++;
    }

    // 🔹 Métodos sobrecargados para actualizar salario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    // 🔹 toString(): representación legible
    @Override
    public String toString() {
        return "Empleado [ID=" + id + 
               ", Nombre=" + nombre + 
               ", Puesto=" + puesto + 
               ", Salario=$" + salario + "]";
    }

    // 🔹 Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // 🔹 Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}

