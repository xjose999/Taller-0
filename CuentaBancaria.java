public class CuentaBancaria {
    int numero;
    double saldo;
    String titular;


    public void mostrarCuenta() {
        System.out.println("Su número de cuenta es " + numero);
        System.out.println("Su saldo en la cuenta es de " + saldo);
        System.out.println("El titular de la cuenta es " + titular);

    }

    public static void main (String[] args) {

        //PRIMERA CUENTA
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = 9935247;
        cuenta1.saldo = 220.000;
        cuenta1.titular = "José Daniel Ballesteros";


        //SEGUNDA CUENTA
        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.numero = 7328124;
        cuenta2.saldo = 100.000;
        cuenta2.titular = "Manuel José Ballesteros Cantero";

        cuenta2.saldo= 120.000;

        System.out.println("Datos de la primera cuenta: ");
        cuenta1.mostrarCuenta();

        System.out.println("Datos de la segunda cuenta");
        cuenta2.mostrarCuenta();


    }

}