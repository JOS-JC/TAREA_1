//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear libros
        Libro libro1 = new Libro("Libro de chistes", "Gabriel Perez Márquez", "Editorial Guatemalteca", 1967, 417);
        Libro libro2 = new Libro("Las ideas del mundo", "Nery Lic", "NORMA", 2004, 328);

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Crear usuarios
        Usuario usuario1 = new Usuario("Jose", "Julajuj", "Jose.Julajuj@gmail.com", "123456");
        Usuario usuario2 = new Usuario("Diego", "Pivaral", "Diego.Pivaral@gmail.com", "654321");

        // Registrar usuarios
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // Realizar un préstamo
        biblioteca.realizarPrestamo(libro1, usuario1);

        // Consultar préstamos activos
        System.out.println("Préstamos activos:");
        for (Prestamo prestamo : biblioteca.consultarPrestamosActivos()) {
            System.out.println(prestamo);
        }

        // Devolver un libro
        biblioteca.devolverLibro(libro1, usuario1);

        // Generar informe de préstamos
        System.out.println("Informe de préstamos:");
        biblioteca.generarInforme();
    }
}