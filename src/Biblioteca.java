import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;

public class Biblioteca {
    private List<Libro> libros;
    private Map<String, Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new HashMap<>();
        prestamos = new ArrayList<>();
    }

    // Métodos para gestionar libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(String titulo) {
        libros.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(titulo));
    }

    public Libro buscarLibro(String titulo) {
        return libros.stream()
                .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    public List<Libro> listarLibros() {
        return libros;
    }

    // Métodos para gestionar usuarios
    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNumeroIdentificacion(), usuario);
    }

    public Usuario consultarUsuario(String id) {
        return usuarios.get(id);
    }

    // Métodos para gestionar préstamos
    public void realizarPrestamo(Libro libro, Usuario usuario) {
        prestamos.add(new Prestamo(libro, usuario, LocalDate.now(), null));
    }

    public void devolverLibro(Libro libro, Usuario usuario) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().equals(libro) && prestamo.getUsuario().equals(usuario)) {
                prestamo.setFechaDevolucion(LocalDate.now());
                break;
            }
        }
    }

    public List<Prestamo> consultarPrestamosActivos() {
        return prestamos.stream()
                .filter(prestamo -> prestamo.getFechaDevolucion() == null)
                .toList();
    }

    public void generarInforme() {
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
}
