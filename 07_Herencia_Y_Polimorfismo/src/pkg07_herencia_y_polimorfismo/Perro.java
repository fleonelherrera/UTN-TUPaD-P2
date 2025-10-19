package pkg07_herencia_y_polimorfismo;

public class Perro extends Animal {
    private String raza;
    
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}
