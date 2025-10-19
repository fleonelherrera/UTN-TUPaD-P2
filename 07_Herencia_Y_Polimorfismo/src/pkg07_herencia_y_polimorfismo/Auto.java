package pkg07_herencia_y_polimorfismo;

public class Auto extends Vehiculo {
    private int cantidadPuertas;
    
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Modelo: " + cantidadPuertas);
    }
}
