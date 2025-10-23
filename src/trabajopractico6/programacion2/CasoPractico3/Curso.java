
package trabajopractico6.programacion2.CasoPractico3;

public class Curso {
    private final String codigo;
    private final String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setProfesor(Profesor p) {
        if (profesor != null) {
            profesor.getCursos().remove(this);
        }
        profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        System.out.println(codigo + " - " + nombre +
                " | Profesor: " +
                (profesor != null ? profesor.getId() : "Sin asignar"));
    }
}
