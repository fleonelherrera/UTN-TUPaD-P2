package pkg07_herencia_y_polimorfismo;

public class Gato extends Animal {
    private String tipo;
    
    public Gato(String nombre, int edad, String tipo) {
        super(nombre, edad);
        this.tipo = tipo;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}
