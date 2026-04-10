public class Producto {
    String nombre;
    int stock;
    int precio;

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Stock actual: " + stock);
    }

    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidades.");
        } else {
            System.out.println("Error: No hay suficiente stock.");
        }
    }


    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            stock = stock + cantidad;
            System.out.println("Reabastecimiento exitoso: Se sumaron " + cantidad + " unidades.");
        } else {
            System.out.println("Error: La cantidad a reabastecer debe ser mayor a 0.");
        }
    }

    public static void main (String[] args) {
        Producto product1 = new Producto();
        product1.nombre = "Juguete Max Steel";
        product1.stock = 10;
        product1.precio = 200;

        product1.mostrarProducto();


        System.out.println("\n--- Llegó un pedido de fábrica ---");
        product1.reabastecer(50);


        product1.mostrarProducto();
    }
}