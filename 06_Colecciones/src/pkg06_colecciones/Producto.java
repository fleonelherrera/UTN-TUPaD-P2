package pkg06_colecciones;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    public void mostrarInfo() {
        System.out.print("Id: " + getId() + ", ");
        System.out.print("Nombre: " + getNombre() + ", ");
        System.out.print("Precio: " + getPrecio() + ", ");
        System.out.print("Cantidad: " + getCantidad() + ", ");
        System.out.println("Categoria: " + categoria.getDescripcion());
    }
    
    public void actualizarStock(int nuevaCantidad) {
        // AL RECIBIR UNA NUEVA CANTIDAD, PISAMOS LA ACTUAL
        if (nuevaCantidad >= 0) {
            this.cantidad = nuevaCantidad;
        } else {
            System.out.println("No se puede ingresar una cantidad menor que cero");
        }
    }
    
    public boolean esDeCategoria(CategoriaProducto categoria) {
        return getCategoria() == categoria;
    }
}
