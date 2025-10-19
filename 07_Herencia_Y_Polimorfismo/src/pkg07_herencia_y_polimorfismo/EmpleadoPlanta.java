package pkg07_herencia_y_polimorfismo;

public class EmpleadoPlanta extends Empleado {
    private double sueldoBasico;
    private double bonoAntiguedad;
    private int aniosAntiguedad;
    
    public EmpleadoPlanta(String nombre, double sueldoBasico, double bonoAntiguedad, int aniosAntiguedad) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
        this.bonoAntiguedad = bonoAntiguedad;
        this.aniosAntiguedad = aniosAntiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoBasico + (bonoAntiguedad * aniosAntiguedad);
    }
}
