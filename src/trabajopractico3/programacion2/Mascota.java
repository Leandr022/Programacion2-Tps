package trabajopractico3.programacion2;

public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " es un/a " + especie + " de " + edad + " años.");
    }

    public void cumplirAnios() {
        edad++;
    }
}
