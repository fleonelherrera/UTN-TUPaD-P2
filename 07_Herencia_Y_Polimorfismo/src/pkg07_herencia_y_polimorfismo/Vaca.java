package pkg07_herencia_y_polimorfismo;

public class Vaca extends Animal {
    private double peso;
    
    public Vaca(String nombre, int edad, double peso) {
        super(nombre, edad);
        this.peso = peso;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Muu");
    }
}
