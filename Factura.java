public class Factura {
    int numero;
    String cliente;
    double valor;

    public void mostrarFactura() {
        System.out.println("Factura Nro: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor total: $" + valor);
    }

    public static void main(String[] args) {
        Factura miFactura = new Factura();

        miFactura.numero = 101;
        miFactura.cliente = "José Daniel";
        miFactura.valor = 150000.0;

        miFactura.mostrarFactura();
    }
}