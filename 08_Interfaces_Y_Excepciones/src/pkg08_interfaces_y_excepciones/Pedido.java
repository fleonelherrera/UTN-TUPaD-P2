package pkg08_interfaces_y_excepciones;

import java.util.ArrayList;

public class Pedido implements Pagable {
    private ArrayList<Producto> productos = new ArrayList();
    private double totalPedido = 0;
    private String estado;
    private Cliente cliente;
    
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void AgregarProducto(Producto p) {
        productos.add(p);
    }
    
    @Override
    public double CalcularTotal() {
        double total = 0;
        for(Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
    
    public void ActualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.EnviarNotificacion("El pedido cambio de estado a: " + nuevoEstado);
    }
}
