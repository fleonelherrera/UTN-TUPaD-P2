package pkg05_uml_basico;
import java.time.LocalDate;

public class ClaveSeguridad {
    private String codigo;
    private LocalDate ultimaModificacion;

    public ClaveSeguridad(String codigo, LocalDate ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
}
