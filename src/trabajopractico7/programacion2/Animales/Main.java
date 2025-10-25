
package trabajopractico7.programacion2.Animales;


public class Main {

    public static void main(String[] args) {
       ArrayList<Animal> animales = new ArrayList<>();
       
       Perro p1 = new Perro();
       Gato g1 = new Gato();
       Vaca v1 = new Vaca();
       
       animales.add(p1);
       animales.add(g1);
       animales.add(v1);

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
        }
    }
}