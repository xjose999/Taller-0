public class Producto {
    String nombre;
    int stock;
    int precio;

    public void mostrarProducto() {
        System.out.println("Su producto es " + nombre);
        System.out.println("En stock hay " + stock);
        System.out.println("Su producto tiene un valor de " + precio);
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

        Producto product3 = new Producto();
        product3.nombre = "Juguete HotWheels";
        product3.stock  = 320;
        product3.precio = 5;

        product1.mostrarProducto();
        product2.mostrarProducto();
    }
}