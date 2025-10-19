package pkg07_herencia_y_polimorfismo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // EJERCICIO 1
        Auto a1 = new Auto("Fiat", "No", 4);
        a1.mostrarInfo();
        
        
        // EJERCICIO 2
        Figura f1 = new Circulo("cirk", 3);
        Figura f2 = new Rectangulo("rec", 4, 3);
        Figura f3 = new Rectangulo("rec2", 6, 7);
        Figura f4 = new Circulo("cirk2", 8);
        Figura f5 = new Circulo("cirk3", 2);
        
        ArrayList<Figura> figuras = new ArrayList();
        figuras.add(f1);
        figuras.add(f2);
        figuras.add(f3);
        figuras.add(f4);
        figuras.add(f5);

        for(Figura f : figuras) {
            System.out.println("Area de la figura: " + f.calcularArea());
        }

        
        // EJERCICIO 3
        Empleado e1 = new EmpleadoPlanta("Franco", 1200, 80, 2);
        Empleado e2 = new EmpleadoTemporal("Juan", 90, 36);
        Empleado e3 = new EmpleadoPlanta("Felipe", 1100, 30, 1);
        Empleado e4 = new EmpleadoPlanta("Pedro", 1600, 120, 4);
        Empleado e5 = new EmpleadoTemporal("Salvador", 80, 42);
        
        ArrayList<Empleado> empleados = new ArrayList();
        ArrayList<EmpleadoPlanta> empleadosPlanta = new ArrayList();
        ArrayList<EmpleadoTemporal> empleadosTemporales = new ArrayList();
        
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        empleados.add(e5);

        for(Empleado e : empleados) {
            System.out.println("El sueldo del empleado es: " + e.calcularSueldo());
            if (e instanceof EmpleadoPlanta) {
                empleadosPlanta.add((EmpleadoPlanta)e);
            } else {
                empleadosTemporales.add((EmpleadoTemporal)e);
            }
        }
        
        // CLASIFICACION DE LOS EMPLEADOS
        System.out.println("Empleados planta: ");
        for (EmpleadoPlanta ep : empleadosPlanta) {
            System.out.println(ep.getNombre());
        }
        
        System.out.println("-----------------------------------");
        System.out.println("Empleados temporales: ");
        for (EmpleadoTemporal et : empleadosTemporales) {
            System.out.println(et.getNombre());
        }
        
        
        // EJERCICIO 4
        Animal an1 = new Perro("Tobi", 3, "Boxer");
        Animal an2 = new Gato("Silvio", 8, "Siames");
        Animal an3 = new Vaca("Lola", 6, 40);
        Animal an4 = new Perro("Lisa", 9, "Labrador");
        Animal an5 = new Gato("Maestro", 3, "Callejero");
        
        ArrayList<Animal> animales = new ArrayList();
        animales.add(an1);
        animales.add(an2);
        animales.add(an3);
        animales.add(an4);
        animales.add(an5);
        
        for(Animal a : animales) {
            a.hacerSonido();
        }
    }
}
