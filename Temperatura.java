public class Temperatura {
    double celsius;

    public double obtenerFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public void mostrarConversion() {
        System.out.println("Temperatura en Celsius: " + celsius + "°C");
        System.out.println("Equivalente en Fahrenheit: " + obtenerFahrenheit() + "°F");
    }

    public static void main(String[] args) {
        Temperatura termometro = new Temperatura();

        termometro.celsius = 25.0;
        termometro.mostrarConversion();
    }
}
