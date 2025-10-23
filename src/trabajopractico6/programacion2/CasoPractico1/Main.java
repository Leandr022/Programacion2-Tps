
package trabajopractico6.programacion2.CasoPractico1;

public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        // Crear Productos
        Producto p1 = new Producto("A01", "Pan", 800, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E01", "Auriculares", 2500, 20, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R01", "Remera", 1500, 35, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H01", "Taza", 1200, 40, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A02", "Galletitas", 1000, 60, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Listar
        inventario.listarProductos();

        // Buscar por ID
        System.out.println("\n Buscando producto R01:");
        Producto buscado = inventario.buscarProductoPorId("R01");
        if (buscado != null) buscado.mostrarInfo();

        // Filtrar por categoria
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // Eliminar
        inventario.eliminarProducto("E01");
        inventario.listarProductos();

        // Actualizar stock
        inventario.actualizarStock("H01", 100);

        // Total de stock disponible
        System.out.println("\n Total de Stock: " + inventario.obtenerTotalStock());

        // Producto con mayor stock
        System.out.println("\n Producto con mayor stock:");
        inventario.obtenerProductoConMayorStock().mostrarInfo();

        // Filtrar por precio
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // Mostrar categorías
        inventario.mostrarCategoriasDisponibles();
    }
}
