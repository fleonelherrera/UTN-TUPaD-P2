package pkg03_introduccion_a_poo;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion < 0 || anioPublicacion > LocalDate.now().getYear()) {
            System.out.println("El año ingresado no es valido.");
        } else {
            this.anioPublicacion = anioPublicacion;
        }
    }
    
    
}
