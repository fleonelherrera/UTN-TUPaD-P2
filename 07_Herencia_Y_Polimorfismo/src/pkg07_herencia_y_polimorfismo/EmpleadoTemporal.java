package pkg07_herencia_y_polimorfismo;

public class EmpleadoTemporal extends Empleado {
    private double sueldoPorHora;
    private int horasTrabajadas;
    
    public EmpleadoTemporal(String nombre, double sueldoPorHora, int horasTrabajadas) {
        super(nombre);
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoPorHora * horasTrabajadas;
    }
}
