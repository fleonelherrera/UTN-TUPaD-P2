package pkg05_uml_basico;
import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String nro, LocalDate fechaEmision, String urlImagen) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(urlImagen, "jpg");
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }
}
