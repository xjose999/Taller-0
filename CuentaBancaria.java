public class CuentaBancaria {
    int numero;
    double saldo;
    String titular;


    public void mostrarCuenta() {
        System.out.println("---------------------------");
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numero);
        System.out.println("Saldo actual: $" + saldo);
    }


    public void consignar(double valor) {
        saldo = saldo + valor;
        System.out.println(">>> Se han consignado: $" + valor);
    }

    public static void main (String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = 9935247;
        cuenta1.saldo = 220000.0;
        cuenta1.titular = "José Daniel Ballesteros";


        cuenta1.mostrarCuenta();


        cuenta1.consignar(50000.0);


        cuenta1.mostrarCuenta();
    }
}