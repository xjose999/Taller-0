public class Producto {
    String nombre;
    int stock;
    int precio;


    public void mostrarProducto() {
        System.out.println("---------------------------");
        System.out.println("Su producto es: " + nombre);
        System.out.println("En stock hay: " + stock);
        System.out.println("Su producto tiene un valor de: " + precio);
    }


    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("Error: No hay suficiente stock de " + nombre + ". Intento de venta: " + cantidad + " | Disponible: " + stock);
        }
    }

    public static void main (String[] args) {

        Producto product1 = new Producto();
        product1.nombre = "Juguete Max Steel";
        product1.stock = 60;
        product1.precio = 200;


        Producto product2 = new Producto();
        product2.nombre = "Juguete Barbie";
        product2.stock = 25;
        product2.precio = 250;




        product1.vender(10);
        product1.mostrarProducto();


        product2.vender(30);
        product2.mostrarProducto();
    }
}