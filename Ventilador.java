public class Ventilador {
    String marca;
    int velocidad;
    boolean encendido;

    public Ventilador(String marca) {
        this.marca = marca;
        this.velocidad = 0;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        if (velocidad == 0) {
            velocidad = 1;
        }
    }

    public void apagar() {
        encendido = false;
        velocidad = 0;
    }

    public void subirVelocidad() {
        if (encendido) {
            velocidad++;
        }
    }

    public void mostrarEstado() {
        String estado = encendido ? "Encendido" : "Apagado";
        System.out.println("Ventilador " + marca + " | Estado: " + estado + " | Velocidad: " + velocidad);
    }

    public static void main(String[] args) {
        Ventilador miVentilador = new Ventilador("Samurai");

        miVentilador.mostrarEstado();

        miVentilador.encender();
        miVentilador.subirVelocidad();
        miVentilador.mostrarEstado();

        miVentilador.apagar();
        miVentilador.mostrarEstado();
    }
}