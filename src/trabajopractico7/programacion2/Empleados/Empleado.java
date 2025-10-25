
package trabajopractico7.programacion2.Empleados;


public abstract class Empleado {
    

    public double calcularSueldo(Empleado e){
        if (e instanceof EmpleadsoPlanta){
            return 900000.0;
        } else if (e instanceof EmpleadoTemporal){
            return 850000.0;
        }else {
            return 0;
        }
    }
}
