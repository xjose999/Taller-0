public class Negocio {
    String nombreCliente;
    String servicio;
    double precio;

    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * (porcentaje / 100));
    }

    public void imprimirFactura() {
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Servicio: " + servicio);
        System.out.println("Total a pagar: $" + precio);
    }

    public static void main(String[] args) {
        Negocio miVenta = new Negocio();

        miVenta.nombreCliente = "Jose Daniel";
        miVenta.servicio = "Mantenimiento PC";
        miVenta.precio = 80000.0;

        miVenta.aplicarDescuento(10.0);
        miVenta.imprimirFactura();
    }
}