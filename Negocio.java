
//Esta es la clase
public class Negocio {
    //Estos sus atributos
    String producto;
    int cantidad;

    public void vender() {
        cantidad = cantidad - 1;
    }

    public void mostrarStock() {
        System.out.println("Producto: " + producto + " | Unidades: " + cantidad);
    }

    public static void main(String[] args) {
        // Objeto 1
        Negocio obj1 = new Negocio();
        obj1.producto = "Monitor";
        obj1.cantidad = 10;

        // Objeto 2
        Negocio obj2 = new Negocio();
        obj2.producto = "Teclado";
        obj2.cantidad = 25;

        // Objeto 3
        Negocio obj3 = new Negocio();
        obj3.producto = "Mouse";
        obj3.cantidad = 40;

        // Objeto 4
        Negocio obj4 = new Negocio();
        obj4.producto = "Audifonos";
        obj4.cantidad = 15;

        // Objeto 5
        Negocio obj5 = new Negocio();
        obj5.producto = "Microfono";
        obj5.cantidad = 8;

        // Ejemplo de venta con el objeto 1
        obj1.vender();

        // Mostrar inventario de todos
        obj1.mostrarStock();
        obj2.mostrarStock();
        obj3.mostrarStock();
        obj4.mostrarStock();
        obj5.mostrarStock();
    }
}