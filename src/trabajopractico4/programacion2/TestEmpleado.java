
package trabajopractico4.programacion2;

public class TestEmpleado {
    public static void main(String[] args) {
        // 🔹 Instanciar empleados usando ambos constructores
        EmpleadoTp4 emp1 = new EmpleadoTp4(101, "Juan Pérez", "Analista", 2500.0);
        EmpleadoTp4 emp2 = new EmpleadoTp4("Ana Gómez", "Desarrolladora");
        EmpleadoTp4 emp3 = new EmpleadoTp4("Carlos López", "Soporte");

        // 🔹 Actualizar salarios con sobrecarga
        emp1.actualizarSalario(10.0);  // +10%
        emp2.actualizarSalario(500);   // +500 fijo
        emp3.actualizarSalario(5.0);   // +5%

        // 🔹 Mostrar información con toString()
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        // 🔹 Mostrar total de empleados
        System.out.println("Total de empleados creados: " + EmpleadoTp4.mostrarTotalEmpleados());
    }
}

