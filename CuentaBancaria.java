public class CuentaBancaria {
    String numero;
    String titular;
    double saldo;


    public CuentaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void mostrarEstado() {

        System.out.println("Cuenta No: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Actual: $" + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("750-25200-40", "José Daniel Ballesteros", 50000.0);


        miCuenta.mostrarEstado();
    }
}