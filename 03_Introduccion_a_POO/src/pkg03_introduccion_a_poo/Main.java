package pkg03_introduccion_a_poo;

public class Main {

    public static void main(String[] args) {
        
        // NOTA: para hacer cada programa fui comentando los anteriores y es por eso que vuelvo a declarar variables que ya existian de ejercicios anteriores.
        // Para que el codigo no de error se debe comentar los ejercicios que no se estan probando.
        

        // EJERCICIO 1
        Estudiante a1 = new Estudiante();
        a1.nombre = "Ana";
        a1.apellido = "Rodriguez";
        a1.curso = "6A";
        a1.clasificacion = 8;
        
        a1.mostrarInfo();
        
        a1.subirCalificacion(2);
        
        a1.mostrarInfo();
        
        a1.bajarCalificacion(10);
        
        a1.mostrarInfo();
        
        
        // EJERCICIO 2
        Mascota m1 = new Mascota();
        m1.nombre = "Tommy";
        m1.especie = "Perro";
        
        // 2025
        m1.edad = 5;
        
        //2026
        m1.cumplirAnios();
        
        //2027
        m1.cumplirAnios();
        m1.mostrarInfo();
        
        
        // EJERCICIO 3
        Libro l1 = new Libro();
        
        l1.setAnioPublicacion(-200); // AÑO INVALIDO
        l1.setAnioPublicacion(2020); // AÑO VALIDO
        
        // INFO
        System.out.println("Nombre del libro: " + l1.getTitulo());
        System.out.println("Autor del libro: " + l1.getAutor());
        System.out.println("Año de publicacion: " + l1.getAnioPublicacion());
        
        
        // EJERCICIO 4
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();
        
        g1.ponerHuevo();
        g1.ponerHuevo();
        
        g2.ponerHuevo();
        
        g1.envejecer();
        g2.envejecer();
        
        g1.mostrarEstado();
        g2.mostrarEstado();

        
        // EJERCICIO 5
        NaveEspacial nave = new NaveEspacial();
        nave.combustible = 50;
        nave.avanzar(2);
        System.out.println("-----------------------------------");
        nave.recargarCombustible(70);
        System.out.println("-----------------------------------");
        nave.avanzar(2);
        System.out.println("-----------------------------------");
        System.out.println("Estado de la nave: ");
        nave.mostrarEstado();
    }
}
