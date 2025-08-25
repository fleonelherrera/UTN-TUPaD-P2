package pkg03_introduccion_a_poo;

public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    public void cumplirAnios() {
        edad += 1;
    }
}
