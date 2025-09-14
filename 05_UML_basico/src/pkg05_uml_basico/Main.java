package pkg05_uml_basico;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        // EJERCICIO 1
        // RELACIONES:
        // COMPOSICION: PASAPORTE -> FOTO
        // ASOCIACION BIDIRECCIONAL: PASAPORTE <-> TITULAR
        Titular titular = new Titular("Franco", "42680156");
        Pasaporte pasaporte = new Pasaporte("1", LocalDate.of(2000, 01, 01), "foto.jpg");
        
        titular.setPasaporte(pasaporte);
        System.out.println(titular.getPasaporte());
        
        // EJERCICIO 2
        // RELACIONES:
        // AGREGACION: CELULAR -> BATERIA
        // ASOCIACION BIDIRECCIONAL: CELULAR <-> USUARIO
        
        // EJERCICIO 3
        // RELACIONES:
        // ASOCIACION UNIDIRECCIONAL: LIBRO -> AUTOR
        // AGREGACION: LIBRO -> EDITORIAL
        
        // EJERCICIO 4
        // RELACIONES:
        // ASOCIACION BIDIRECCIONAL: TARJETADECREDITO <-> CLIENTE
        // AGREGACION: TARJETADECREDITO -> BANCO
        
        // EJERCICIO 5
        // RELACIONES:
        // COMPOSICION: COMPUTADORA -> PLACAMADRE
        // ASOCIACION BIDIRECCIONAL: COMPUTADORA <-> PROPIETARIO
        
        // EJERCICIO 6
        // RELACIONES:
        // ASOCIACION UNIDIRECCIONAL: RESERVA -> CLIENTE
        // AGREGACION: RESERVA -> MESA
        
        // EJERCICIO 7
        // RELACIONES:
        // AGREGACION: VEHICULO -> MOTOR
        // ASOCIACION BIDIRECCIONAL: VEHICULO <-> CONDUCTOR
        
        // EJERCICIO 8
        // RELACIONES:
        // COMPOSICION: DOCUMENTO -> FIRMADIGITAL
        // AGREGACION: FIRMADIGITAL -> USUARIO
        
        // EJERCICIO 9
        // RELACIONES:
        // ASOCIACION UNIDIRECCIONAL: CITAMEDICA -> PACIENTE
        // ASOCIACION UNIDIRECCIONAL: CITAMEDICA -> PROFESIONAL
        
        // EJERCICIO 10
        // RELACIONES:
        // COMPOSICION: CUENTABANCARIA -> CLAVESEGURIDAD
        // ASOCIACION BIDIRECCIONAL: CUENTABANCARIA <-> TITULAR
        
        // EJERCICIO 11
        // RELACIONES:
        // ASOCIACION UNIDIRECCIONAL: CANCION -> ARTISTA
        // DEPENDENCIA DE USO: REPRODUCIR(CANCION)
        
        // EJERCICIO 12
        // RELACIONES:
        // ASOCIACION UNIDIRECCIONAL: IMPUESTO -> CONTRIBUYENTE
        // DEPENDENCIA DE USO: CALCULAR(IMPUESTO)
        
        // EJERCICIO 13
        // RELACIONES:
        // ASOCIACION UNIDIRECCIONAL: CODIGOQR -> USUARIO
        // DEPENDENCIA DE USO: GENERAR(STRING, USUARIO)
        
        // EJERCICIO 14
        // RELACIONES:
        // ASOCIACION UNIDIRECCIONAL: RENDER -> PROYECTO
        // DEPENDENCIA DE USO: EXPORTAR(STRING, PROYECTO)
    }
}
