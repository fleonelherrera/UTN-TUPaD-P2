package pkg01_introduccion_a_java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // NOTA: para hacer cada programa fui comentando los anteriores y es por eso que vuelvo a declarar variables que ya existian de ejercicios anteriores.
        // Para que el codigo no de error se debe comentar los ejercicios que no se estan probando.
        
        Scanner input = new Scanner(System.in);

        // EJERCICIO 3
        String  nombre     = "Franco";
        int     edad       = 25;
        double  altura     = 1.75;
        boolean estudiante = true;
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Es estudiante: " + estudiante);
        
        
        // EJERCICIO 4
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("El nombre del usuario es: " + nombre);
        System.out.println("La edad del usuario es: " + edad);
        
        
        // EJERCICIO 5
        int num1, num2, suma, resta, multiplicacion, division;
        
        System.out.print("Ingrese un numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese otro numero entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        suma           = num1 + num2;
        resta          = num1 - num2;
        multiplicacion = num1 * num2;
        division       = num1 / num2;
        
        System.out.println("La resultado de la suma es: " + suma);
        System.out.println("La resultado de la resta es: " + resta);
        System.out.println("La resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("La resultado de la division es: " + division);
        
        
        // EJERCICIO 6
        System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");
        
                
        // EJERCICIO 8a
        int num1, num2, division;
        
        System.out.print("Ingrese un numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese otro numero entero: ");
        num2 = Integer.parseInt(input.nextLine());

        division = num1 / num2;
        
        System.out.println("La resultado de la division es: " + division);
        
        
        // EJERCICIO 8b
        double num1, num2, division;
        
        System.out.print("Ingrese un numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese otro numero entero: ");
        num2 = Integer.parseInt(input.nextLine());

        division = num1 / num2;
        
        System.out.println("La resultado de la division es: " + division);
        
        
        // EJERCICIO 9 CORREGIDO
        System.out.print("Ingresa tu nombre:");
        String nombre = input.nextLine();
        System.out.println("Hola," + nombre);
    }
}
