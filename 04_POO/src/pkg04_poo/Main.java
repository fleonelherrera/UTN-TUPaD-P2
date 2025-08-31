package pkg04_poo;

public class Main {

    public static void main(String[] args) {
        
        Empleado e1 = new Empleado(1, "Ana", "Psicologa", 999.99);
        Empleado e2 = new Empleado("Franco", "Programador");
        
        e1.actualizarSalario(15.00);
        e2.actualizarSalario(1200);
        
        System.out.println("\nEmpleado 1:\n" + e1.toString() + "\n");
        System.out.println("Empleado 2:\n" + e2.toString() + "\n");
        System.out.println("La cantidad total de empleados creados es: " + Empleado.mostrarTotalEmpleados());
    }
    
}
