package pkg05_uml_basico;

public class GeneradorQR {
    public void generar(String valor, Usuario2 usuario) {
    CodigoQR qrGenerado = new CodigoQR(valor);
    qrGenerado.setUsuario(usuario);

    System.out.println("Se genero el QR: " + qrGenerado.getValor());
   }
}
