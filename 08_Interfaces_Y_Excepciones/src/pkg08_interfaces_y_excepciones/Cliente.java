package pkg08_interfaces_y_excepciones;

public class Cliente implements Notificable {
    public String nombre;
    
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void EnviarNotificacion(String mensaje) {
        System.out.println("Hola " + this.nombre + "! " + mensaje);
    }
}
