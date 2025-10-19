package pkg07_herencia_y_polimorfismo;

public abstract class Empleado {
    private String nombre;
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularSueldo();
}
