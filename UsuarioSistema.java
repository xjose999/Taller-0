public class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    public void activar() {
        activo = true;
    }

    public void desactivar() {
        activo = false;
    }

    public void mostrarEstado() {
        String estado = activo ? "Acceso Permitido" : "Acceso Denegado";
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Estado del sistema: " + estado);
    }

    public static void main(String[] args) {
        UsuarioSistema user = new UsuarioSistema();

        user.nombreUsuario = "jballesteros";
        user.clave = "12345abc";

        user.activar();
        user.mostrarEstado();

        user.desactivar();
        user.mostrarEstado();
    }
}
