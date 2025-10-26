package pkg08_interfaces_y_excepciones;

public class Producto implements Pagable {
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    @Override
    public double CalcularTotal() {
        return precio;
    }
    
    public double getPrecio() {
        return precio;
    }
}
