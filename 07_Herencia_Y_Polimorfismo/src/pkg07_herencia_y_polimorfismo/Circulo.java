package pkg07_herencia_y_polimorfismo;

public class Circulo extends Figura {
    private double radio;
    
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return 3.14159 * (radio*radio);
    }
    
}
