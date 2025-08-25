package pkg03_introduccion_a_poo;

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double clasificacion;
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Clasificacion: " + clasificacion);
    }
    
    public void subirCalificacion(double puntos){
        if (puntos <= 0 ){
            System.out.println("La cantidad de puntos a subir no puede ser 0 o negativa");
        } else {
            if (clasificacion + puntos > 10){
                System.out.println("La clasificacion no puede superar los 10 puntos");
            } else {
                clasificacion += puntos;
            }
        }
        
    }
    
    public void bajarCalificacion(double puntos){
        if (puntos <= 0 ){
            System.out.println("La cantidad de puntos a bajar no puede ser 0 o negativa");
        } else {
            if (clasificacion - puntos < 0){
                System.out.println("La clasificacion no puede ser negativa");
            } else {
                clasificacion -= puntos;
            }
        }
    }
}
