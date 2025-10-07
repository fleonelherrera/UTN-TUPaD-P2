package pkg06_colecciones;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libroAAgregar = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libroAAgregar);
    }
    
    public void listarLibros() {
        for(Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        Libro libroABuscar = null;
        for (Libro libro : libros) {
            if (libro.tieneIsbn(isbn)) {
                libroABuscar = libro;
            }
        }
        return libroABuscar;
    }
    
    public Libro eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        libros.remove(libroAEliminar);
        return libroAEliminar;
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.esDelAnio(anio)) {
                librosFiltrados.add(libro);
            }
        }
        return librosFiltrados;
    }
    
    public ArrayList<Autor> mostrarAutoresDisponibles() {
        ArrayList<Autor> autoresDisponibles = new ArrayList<>();
        for (Libro libro : libros) {
            if (!autoresDisponibles.contains(libro.getAutor()))
            autoresDisponibles.add(libro.getAutor());
        }
        return autoresDisponibles;
    }
}
