package pkg05_uml_basico;

public class CodigoQR {
    private String valor;
    private Usuario2 usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public Usuario2 getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario2 usuario) {
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }
}
