package pkg05_uml_basico;

public class Libro {
    private String isbn;
    private String titulo;
    private Autor autor;
    private Editorial editorial;

    public Libro(String isbn, String titulo, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
   }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }
}
