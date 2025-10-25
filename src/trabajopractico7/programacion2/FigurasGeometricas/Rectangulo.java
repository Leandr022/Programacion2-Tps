
package trabajopractico7.programacion2.FigurasGeometricas;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo " + nombre "es: " + (base * altura));
    }
}
