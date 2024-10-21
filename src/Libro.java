public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int anioPublicacion;
    private int numeroPaginas;

    public Libro(String titulo, String autor, String editorial, int anioPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    // Getters y toString
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
