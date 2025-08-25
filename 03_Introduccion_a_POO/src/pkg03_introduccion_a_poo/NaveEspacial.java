package pkg03_introduccion_a_poo;

public class NaveEspacial {
    
    // LA CONSIGNA NO ES CLARA. NO SE DEFINE UN LIMITE MAXIMO DE COMBUSTIBLE, POR LO QUE DECIDO CREAR EL ATRIBUTO limiteCombustible CON EL VALOR INICIAL 500.
    // TAMPOCO SE DEFINE EL COMBUSTIBLE NECESARIO PARA AVANZAR LA DISTANCIA DADA, POR LO QUE ASUMO QUE PARA AVANZAR UNA UNIDAD DE DISTANCIA NECESITO 60 DE COMBUSTIBLE.
    
    String nombre;
    float combustible;
    float limiteCombustible = 500;
    
    public void despegar() {
        // EL ENUNCIADO NO INDICA QUE HACER CON ESTE METODO
    }
    
    public void avanzar(float distancia) {
        float combustibleNecesario = 60 * distancia;
        
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println("Nave avanzando un total de: " + distancia + " unidades.");
            System.out.println("Combustible restante: " + combustible);
        } else {
            System.out.println("El combustible no es suficiente para avanzar " + distancia + " unidades.");
        }
    }
    
    public void recargarCombustible(float cantidad) {
        if (cantidad < 0 || cantidad > 100) {
            System.out.println("La cantidad de recarga debe ser de entre 0 y 100 unidades");
        } else {
            if (combustible + cantidad <= limiteCombustible) {
                System.out.println("Recargando combustible...");
                combustible += cantidad;
            } else {
                System.out.println("No se puede hacer la recarga. Se supera el limite maximo.");
            }
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + nombre);
    }
}
