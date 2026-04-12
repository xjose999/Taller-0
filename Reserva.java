public class Reserva {
    String nombreCliente;
    String fecha;
    boolean activa;

    public void confirmar() {
        activa = true;
    }

    public void cancelar() {
        activa = false;
    }

    public void mostrarDetalles() {
        String estado = activa ? "Confirmada" : "Cancelada / Pendiente";
        System.out.println("Reserva de: " + nombreCliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Estado: " + estado);
    }

    public static void main(String[] args) {
        Reserva miReserva = new Reserva();

        miReserva.nombreCliente = "José Daniel";
        miReserva.fecha = "20 de Abril";

        miReserva.confirmar();
        miReserva.mostrarDetalles();

        miReserva.cancelar();
        miReserva.mostrarDetalles();
    }
}