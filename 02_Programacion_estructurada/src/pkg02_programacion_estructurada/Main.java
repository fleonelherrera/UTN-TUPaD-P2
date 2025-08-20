package pkg02_programacion_estructurada;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    final static double DESCUENTO_ESPECIAL = 0.1;

    public static void main(String[] args) {
        
        // NOTA: para hacer cada programa fui comentando los anteriores y es por eso que vuelvo a declarar variables que ya existian de ejercicios anteriores.
        // Para que el codigo no de error se debe comentar los ejercicios que no se estan probando.
        
        Scanner input = new Scanner(System.in);
        
        // EJERCICIO 1
        int anio;
        
        System.out.print("Ingrese un año: ");
        anio = Integer.parseInt(input.nextLine());
        
        if ((anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0)){
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

        
        // EJERCICIO 2
        int num1, num2, num3, mayor;
        
        System.out.print("Ingrese un numero entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese otro numero entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese un ultimo numero entero: ");
        num3 = Integer.parseInt(input.nextLine());
        
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3){
            mayor = num2;
        } else {
            mayor = num3;
        }
        
        System.out.println("El mayor numero es: " + mayor);
        
        
        // EJERCICIO 3
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12) {
            System.out.println("Eres un niño.");
        } else if (edad >= 12 && edad <= 17){
            System.out.println("Eres un adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un adulto.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }
        
        
        // EJERCICIO 4
        double precio, precioConDescuento, descuento;
        int porcDescuento;
        char categoria;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        categoria = input.nextLine().charAt(0);
        
        switch(categoria){
            case 'A':
            case 'a':
                porcDescuento = 10;
                break;
            case 'B':
            case 'b':
                porcDescuento = 15;
                break;
            case 'C':
            case 'c':
                porcDescuento = 20;
                break;
            default:
                System.out.println("La categoria ingresada no es valida.");
                return; // Cuando la categoria no es valida corto el programa
        }
        
        descuento = (precio * porcDescuento) / 100;
        precioConDescuento = precio - descuento;
        
        System.out.println("Descuento aplicado: " + porcDescuento + "%");
        System.out.println("Precio final: " + precioConDescuento);
        
        
        // EJERCICIO 5
        int numIngresado, sumaPares;
        sumaPares = 0;
        
        System.out.print("Ingrese un numero (0 para terminar): ");
        numIngresado = Integer.parseInt(input.nextLine());
        
        while (numIngresado != 0){
            
            if (numIngresado % 2 == 0){
                sumaPares += numIngresado;
            }
            
            System.out.print("Ingrese un numero (0 para terminar): ");
            numIngresado = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        
        
        // EJERCICIO 6
        int cantPositivos = 0, cantNegativos = 0, cantCeros = 0;
        
        for (int i = 1; i <= 10; i++){
            int numIngresado;
            
            System.out.print("Ingrese el numero " + i + ": ");
            numIngresado = Integer.parseInt(input.nextLine());
            
            if (numIngresado > 0){
                cantPositivos+= 1;
            } else if (numIngresado < 0){
                cantNegativos += 1;
            } else {
                cantCeros += 1;
            }
        }
        
        System.out.println("Resultados:");
        System.out.println("Positivos: " + cantPositivos);
        System.out.println("Negativos: " + cantNegativos);
        System.out.println("Ceros: " + cantCeros);
        
        
        // EJERCICIO 7
        int notaIngresada;
        
        do {
            System.out.print("Ingrese una nota (0-10): ");
            notaIngresada = Integer.parseInt(input.nextLine());
            
            if (notaIngresada < 0 || notaIngresada > 10){
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
            
        } while (notaIngresada < 0 || notaIngresada > 10);
        
        System.out.println("Nota guardada correctamente.");
        
        
        // EJERCICIO 8
        double precioBase, impuesto, descuento;
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = Double.parseDouble(input.nextLine());
        
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(precioBase, impuesto, descuento));
        
        
        // EJERCICIO 9
        double precioProducto, pesoPaquete;
        String zonaEnvio;
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        pesoPaquete = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zonaEnvio = input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);
        
        System.out.println("El costo del envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + calcularTotalCompra(precioProducto, costoEnvio));
        
        
        // EJERCICIO 10
        int stockActual, cantVendida, cantRecibida;
        
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        cantVendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        cantRecibida = Integer.parseInt(input.nextLine());
        
        System.out.println("El nuevo stock del producto es: " + actualizarStock(stockActual, cantVendida, cantRecibida));
        
        
        // EJERCICIO 11
        double precio;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        calcularDescuentoEspecial(precio);
        
        
        // EJERCICIO 12
        double[] precios = {21.25, 27, 31.50, 38};
        
        mostrarValoresArray(precios, true);
        
        precios[0] = 10;
        
        mostrarValoresArray(precios, false);

        
        // EJERCICIO 13
        double[] precios = {5, 27, 35, 40, 10};
        
        System.out.println("Precios originales: ");
        mostrarValoresArrayRecur(precios);
        
        precios[0] = 55;
        
        System.out.println("Precios modificados: ");
        mostrarValoresArrayRecur(precios);
    }
    
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
    }
    
    static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio;
        
        if (zona.equalsIgnoreCase("Nacional")){
            costoEnvio = peso * 5;
        } else {
            costoEnvio = peso * 10;
        }
        
        return costoEnvio;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    static void mostrarValoresArray(double[] array, boolean arrayOriginal) {
        
        if (arrayOriginal) {
            System.out.println("Precios originales: ");
        } else {
            System.out.println("Precios modificados: ");
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Precio: $" + array[i]);
        }
    }
    
    static void mostrarValoresArrayRecur(double[] array){
        if (array.length == 1){
            System.out.println("Precio: $" + array[0]);
        } else {
            System.out.println("Precio: $" + array[0]);
            mostrarValoresArrayRecur(Arrays.copyOfRange(array, 1, array.length));
        }
    }
}
