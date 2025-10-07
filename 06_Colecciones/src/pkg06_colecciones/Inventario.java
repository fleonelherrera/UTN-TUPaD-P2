package pkg06_colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
        }
    }
    
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("Inventario vacio");
        } else {
            for (Producto prod : productos) {
                prod.mostrarInfo();
            }
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        Producto productoEncontrado = null;
        Iterator<Producto> it = this.productos.iterator();
        
        while (it.hasNext() && productoEncontrado == null) {
            Producto prod = it.next();
            if (prod.getId().equals(id)) {
                productoEncontrado = prod;
            }
        }
        return productoEncontrado;
    }
    
    // RETORNAMOS EL PRODUCTO ELIMINADO
    public Producto eliminarProducto(String id) {
        Producto prodAEliminar = buscarProductoPorId(id);
        this.productos.remove(prodAEliminar);
        return prodAEliminar;
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto prodAActualizar = buscarProductoPorId(id);
        prodAActualizar.actualizarStock(nuevaCantidad);
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for (Producto prod : productos) {
            if (prod.esDeCategoria(categoria)) {
                productosFiltrados.add(prod);
            }
        }
        return productosFiltrados;
    }
    
    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto prod : productos) {
            totalStock += prod.getCantidad();
        }
        return totalStock;
    }
    
    public Producto obtenerProductoConMayorStock() {
        // ESTE METODO RETORNA EL PRIMER PRODUCTO CON MAYOR STOCK QUE SE ENCUENTRA
        Producto prodMayorStock = null;
        int mayorStock = -1;
        for (Producto prod : productos) {
            if (prod.getCantidad() > mayorStock) {
                mayorStock = prod.getCantidad();
                prodMayorStock = prod;
            }
        }
        return prodMayorStock;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productosEnRango = new ArrayList<>();
        for (Producto prod : productos) {
            if (prod.getPrecio() >= min && prod.getPrecio() <= max) {
                productosEnRango.add(prod);
            }
        }
        return productosEnRango;
    }
    
    public ArrayList<CategoriaProducto> mostrarCategoriasDisponibles() {
        ArrayList<CategoriaProducto> categoriasDisponibles = new ArrayList<>();
        for (Producto prod : productos) {
            if (!categoriasDisponibles.contains(prod.getCategoria())) {
                categoriasDisponibles.add(prod.getCategoria());
            }
        }
        return categoriasDisponibles;
    }
}
