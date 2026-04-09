public class CuentaBancaria {
    int numero;
    double saldo;
    String titular;

    public void mostrarCuenta() {
        System.out.println("Titular: " + titular + " | Saldo: $" + saldo);
    }

    public void consignar(double valor) {
        saldo = saldo + valor;
        System.out.println("Consignaste: $" + valor);
    }


    public void retirar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Retiro exitoso de: $" + valor);
        } else {
            System.out.println("Error: Saldo insuficiente. Intentaste retirar $" + valor + " pero solo tienes $" + saldo);
        }
    }

    public static void main (String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = 9935247;
        cuenta1.saldo = 100000.0;
        cuenta1.titular = "José Daniel Ballesteros";

        cuenta1.mostrarCuenta();


        cuenta1.retirar(40000.0);


        cuenta1.retirar(70000.0);

        cuenta1.mostrarCuenta();
    }
}