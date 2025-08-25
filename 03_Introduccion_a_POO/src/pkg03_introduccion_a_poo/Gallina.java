package pkg03_introduccion_a_poo;

public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    public void ponerHuevo() {
        huevosPuestos += 1;
    }
    
    public void envejecer() {
        edad += 1;
    }
    
    public void mostrarEstado() {
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
