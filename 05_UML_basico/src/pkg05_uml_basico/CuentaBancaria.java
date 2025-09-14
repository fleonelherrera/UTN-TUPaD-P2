package pkg05_uml_basico;
import java.time.LocalDate;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular2 titular;

    public CuentaBancaria(String cbu, double saldo, String codClave, LocalDate ultModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codClave, ultModificacion);
    }

    public Titular2 getTitular() {
        return titular;
    }

    public void setTitular(Titular2 titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }
}
