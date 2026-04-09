public class Mascota {
    String nombre;
    String especie;
    int edad;

    public void mostrarMascota() {
        System.out.println("Su mascota se llama " + nombre);
        System.out.println("Su mascota es de raza " + especie);
        System.out.println("Su mascota tiene " + edad);
    }

}