public class Producto {
    String nombre;
    int stock;
    int precio;


    public Producto() {
        this.nombre = "Nuevo Producto";
        this.stock = 0;
        this.precio = 0;
    }


    public Producto(String nombre, int stock, int precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Stock: " + stock + " | Precio: $" + precio);
    }

    public static void main(String[] args) {

        Producto prod1 = new Producto();


        Producto prod2 = new Producto("Juguete Max Steel", 60, 200);


        System.out.println(" Registro con Constructor Vacío ");
        prod1.mostrarProducto();

        System.out.println("\n Registro con Constructor con Parámetros ");
        prod2.mostrarProducto();
    }
}