public class Semaforo {
    String colorActual;

    public void cambiarColor() {
        if (colorActual == null || colorActual.equals("Rojo")) {
            colorActual = "Verde";
        } else if (colorActual.equals("Verde")) {
            colorActual = "Amarillo";
        } else if (colorActual.equals("Amarillo")) {
            colorActual = "Rojo";
        }
    }

    public void mostrarEstado() {
        System.out.println("El semaforo esta en: " + colorActual);
    }

    public static void main(String[] args) {
        Semaforo miSemaforo = new Semaforo();

        miSemaforo.colorActual = "Rojo";

        miSemaforo.mostrarEstado();

        miSemaforo.cambiarColor();
        miSemaforo.mostrarEstado();

        miSemaforo.cambiarColor();
        miSemaforo.mostrarEstado();

        miSemaforo.cambiarColor();
        miSemaforo.mostrarEstado();
    }
}