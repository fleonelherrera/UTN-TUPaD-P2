package pkg04_poo;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    public Empleado(String nombre, String puesto){
        // SE OBVIA EL INCREMENTO DE totalEmpleados YA QUE LO HACE EL OTRO METODO, SINO SE HARIA 2 VECES
        this(totalEmpleados + 1, nombre, puesto, 999.00);
    }
    
    public void actualizarSalario(double porcAumento){
        
        if (porcAumento < 0 || porcAumento > 100) {
            System.out.println("El porcentaje ingresado no es válido");
            return;
        }
        
        double aumento = salario * (porcAumento / 100);
        salario += aumento;
        System.out.println("El salario de "+ nombre +" ha sido aumentado un " + porcAumento + "%.");
    }
    
    public void actualizarSalario(int cantAumento){
        
        if (cantAumento <= 0){
            System.out.println("La cantidad a aumentar no puede ser 0 ni negativa.");
            return;
        }
        
        salario += cantAumento;
        System.out.println("Se le ha aumentado al salario de " + nombre + " una cantidad de $" + cantAumento + ".");
    }
    
    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + "]";
   }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
}
