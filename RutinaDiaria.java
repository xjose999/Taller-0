public class RutinaDiaria {
    int tiempoGimnasio;
    int tiempoEstudiando;
    int tiempoJugando;

    public void sumarActividad(int minGimnasio, int minEstudio, int minJuego) {
        tiempoGimnasio = minGimnasio;
        tiempoEstudiando = minEstudio;
        tiempoJugando = minJuego;
    }

    public void mostrarDia() {
        System.out.println("Minutos en el gimnasio: " + tiempoGimnasio);
        System.out.println("Minutos estudiando: " + tiempoEstudiando);
        System.out.println("Minutos jugando: " + tiempoJugando);
    }

    public static void main(String[] args) {
        RutinaDiaria miDia = new RutinaDiaria();

        miDia.sumarActividad(60, 120, 90);
        miDia.mostrarDia();
    }
}