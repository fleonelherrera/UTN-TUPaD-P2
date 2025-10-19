package pkg07_herencia_y_polimorfismo;

public class Rectangulo extends Figura {
    public double base;
    public double altura;
    
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
