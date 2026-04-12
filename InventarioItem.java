public class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    public double calcularValorTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarDetalles() {
        System.out.println("Item: " + nombre);
        System.out.println("Cantidad en stock: " + cantidad);
        System.out.println("Precio por unidad: $" + precioUnitario);
        System.out.println("Valor total del inventario: $" + calcularValorTotal());
    }

    public static void main(String[] args) {
        InventarioItem producto = new InventarioItem();

        producto.nombre = "Teclado Mecanico";
        producto.cantidad = 15;
        producto.precioUnitario = 120000.0;

        producto.mostrarDetalles();
    }
}