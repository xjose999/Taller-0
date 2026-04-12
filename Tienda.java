public class Tienda {
    // ATRIBUTOS: Definicion de los datos de la tienda
    String nombre;
    double ventasTotales;

    // MÉTODO ÚNICO: Incrementa el saldo de ventas totales segun el monto recibido
    public void vender(double monto) {
        ventasTotales = ventasTotales + monto;
    }

    // Metodo auxiliar para visualizar el saldo actual
    public void mostrarCaja() {
        System.out.println("Establecimiento: " + nombre);
        System.out.println("Total en caja: $" + ventasTotales);
    }

    public static void main(String[] args) {
        // Creacion del objeto unico sin usar constructor
        Tienda miTienda = new Tienda();

        // Asignacion directa de valores a los atributos
        miTienda.nombre = "Tienda de Barrio";
        miTienda.ventasTotales = 0.0;

        // Estado inicial de la caja
        miTienda.mostrarCaja();

        // Realizamos una venta de 15000
        miTienda.vender(15000.0);

        // Realizamos otra venta de 5000
        miTienda.vender(5000.0);

        // Mostramos el resultado final despues de las ventas
        System.out.println("\n--- Reporte despues de ventas ---");
        miTienda.mostrarCaja();
    }
}
