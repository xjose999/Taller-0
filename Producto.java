public class Producto {
    String nombre;
    int stock;
    int precio;

    public Producto() {
        this.nombre = "Nuevo";
        this.stock = 0;
        this.precio = 0;
    }

    public Producto(String nombre, int stock, int precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public static Producto crearProductoBasico(String nombre, int precio) {
        return new Producto(nombre, 1, precio);
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Stock: " + stock + " | Precio: $" + precio);
    }

    public static void main(String[] args) {
        Producto p1 = Producto.crearProductoBasico("Teclado", 50000);

        p1.mostrarInfo();
    }
}