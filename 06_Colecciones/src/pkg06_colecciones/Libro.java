package pkg06_colecciones;

public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    public void mostrarInfo() {
        System.out.print("ISBN: " + getIsbn() + ", ");
        System.out.print("Titulo: " + getTitulo() + ", ");
        System.out.print("Anio de publicacion: " + getAnioPublicacion() + "\n");
        System.out.println("Datos del autor: ");
        this.autor.mostrarInfo();
        System.out.println("-------------------------------------------");
    }
    
    public boolean tieneIsbn(String isbn) {
        return this.isbn.equals(isbn);
    }
    
    public boolean esDelAnio(int anio) {
        return this.anioPublicacion == anio;
    }
}
