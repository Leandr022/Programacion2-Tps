
package trabajopractico8.programacion2.Excepciones;

public class LecturaArchivo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de lectura del archivo.");
        }
    }
}