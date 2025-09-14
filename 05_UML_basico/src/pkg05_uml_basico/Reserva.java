package pkg05_uml_basico;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva {
    private LocalDate fecha;
    private LocalDateTime hora;
    private Cliente2 cliente;
    private Mesa mesa;

    public Reserva(LocalDate fecha, LocalDateTime hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente2 cliente) {
        this.cliente = cliente;
    }

    public Cliente2 getCliente() {
        return cliente;
    }
}
