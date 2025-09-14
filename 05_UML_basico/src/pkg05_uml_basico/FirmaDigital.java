package pkg05_uml_basico;
import java.time.LocalDate;

public class FirmaDigital {
    private String codigoHash;
    private LocalDate fecha;
    private Usuario2 usuario;

    public FirmaDigital(String codigoHash, LocalDate fecha, Usuario2 usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
}
