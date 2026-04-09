public class Producto {
    String nombre;
    int stock;
    int precio;

    public void mostrarProducto() {
        System.out.println("Su producto es " + nombre);
        System.out.println("En stock hay " + stock);
        System.out.println("Su producto tiene un valor de " + precio);
    }

}