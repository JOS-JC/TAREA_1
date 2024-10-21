public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String numeroIdentificacion;

    public Usuario(String nombre, String apellido, String correo, String numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    // Getters y toString
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                '}';
    }
}
