
package trabajopractico7.programacion2.FigurasGeometricas;


public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del circulo " + nombre + " es: " (radio * 3.14));
    }
}
