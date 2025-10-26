package pkg08_interfaces_y_excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        // PARTE 2 - EXCEPCIONES
        
        // EJERCICIO 1
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el primero numero: ");
        int num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo numero: ");
        int num2 = Integer.parseInt(input.nextLine());
        
        try {
            double resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        } catch(ArithmeticException ex) {
            System.out.println("No se puede dividir por 0");
        }
        
        // EJERCICIO 2
        System.out.println("Ingrese un texto: ");
        String texto = input.nextLine();
        
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Texto a numero: " + numero);
        } catch(NumberFormatException ex) {
            System.out.println("El texto ingresado no puede ser convertido a numero");
        }
        
        // EJERCICIO 3
        File archivo = new File("archej3.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null ) {
                System.out.println(linea);
            }
        } catch(FileNotFoundException e) {
            System.out.println("Error: el archivo no existe");
        } catch (IOException e) {
            System.out.println("Error de E/S");
            throw new RuntimeException("Error en el catch");
        }
        
        // EJERCICIO 4
        try {
            verificarEdad(-5);
        } catch(EdadInvalidaException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        // EJERCICIO 5
        String ruta = "texto.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }
    }
    
    public static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe ser un valor entre 0 y 120");
        } else {
            System.out.println("Edad valida: " + edad);
        }
    }
}
