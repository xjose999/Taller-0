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
        System.out.println("Titular: " + titular + " | No. Cuenta: " + numero + " | Saldo: $" + saldo);
    }

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("1001", "José Daniel Ballesteros", 150000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("1002", "Andrés Felipe Castro", 85000.50);
        CuentaBancaria cuenta3 = new CuentaBancaria("1003", "Mariana Lucía Vélez", 210000.0);


        System.out.println(" Reporte de Cuentas Bancarias ");
        cuenta1.mostrarEstado();
        cuenta2.mostrarEstado();
        cuenta3.mostrarEstado();
    }
}