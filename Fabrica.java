public class Fabrica {
    String producto;
    int cantidadProduccion;

    public Fabrica(String producto, int cantidadProduccion) {
        this.producto = producto;
        this.cantidadProduccion = cantidadProduccion;
    }

    public void producir() {
        System.out.println("Fabricando lote de " + cantidadProduccion + " unidades de " + producto);
    }

    public static void main(String[] args) {
        Fabrica planta1 = new Fabrica("Zapatos", 500);
        Fabrica planta2 = new Fabrica("Camisetas", 1200);

        planta1.producir();
        planta2.producir();
    }
}
