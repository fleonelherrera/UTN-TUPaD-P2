package pkg05_uml_basico;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaCred;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaCred;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaCred) {
        this.tarjetaCred = tarjetaCred;
        if (tarjetaCred != null && tarjetaCred.getCliente() != this) {
            tarjetaCred.setCliente(this);
        }
   }
}
