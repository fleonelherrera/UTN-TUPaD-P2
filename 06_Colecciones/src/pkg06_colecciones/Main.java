package pkg06_colecciones;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ejercicio3();
    }
    
    public static void ejercicio1() {
        // INVENTARIO Y PRODUCTOS
        
        // 1.
        Producto tv = new Producto("1", "TV Smart 43 pulgadas", 1200.00, 12, CategoriaProducto.ELECTRONICA);
        Producto pc = new Producto("2", "Notebok DELL I5", 3000.00, 10, CategoriaProducto.ELECTRONICA);
        Producto remera = new Producto("3", "Remera negra", 15.00, 20, CategoriaProducto.ROPA);
        Producto zapatillas = new Producto("4", "Zapatillas Adidas", 300.00, 5, CategoriaProducto.ROPA);
        Producto escoba = new Producto("5", "Escoba de barrer", 5.00, 15, CategoriaProducto.HOGAR);
        
        Inventario i = new Inventario();
        
        i.agregarProducto(tv);
        i.agregarProducto(pc);
        i.agregarProducto(remera);
        i.agregarProducto(zapatillas);
        i.agregarProducto(escoba);
        
        // 2.
        i.listarProductos();
        
        // 3.
        System.out.println("Producto con ID: 2");
        Producto prodPorId = i.buscarProductoPorId("2");
        prodPorId.mostrarInfo();
        
        // 4.
        System.out.println("Productos de Electronica: ");
        ArrayList<Producto> productosElectro = i.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for(Producto prod : productosElectro) {
            prod.mostrarInfo();
        }
        
        // 5.
        i.eliminarProducto("4");
        i.listarProductos();
        
        // 6.
        escoba.actualizarStock(3);
        escoba.mostrarInfo();
        
        // 7.
        System.out.println("El total de stock del inventario es: " + i.obtenerTotalStock());
        
        // 8.
        Producto prodConMayorStock = i.obtenerProductoConMayorStock();
        System.out.println("El producto con mayor stock es: ");
        prodConMayorStock.mostrarInfo();
        
        // 9.
        ArrayList<Producto> ProdEntre1000Y3000 = i.filtrarProductosPorPrecio(1000, 3000);
        for(Producto prod : ProdEntre1000Y3000) {
            prod.mostrarInfo();
        }
        
        // 10.
        ArrayList<CategoriaProducto> categoriasDisponibles = i.mostrarCategoriasDisponibles();
        for (CategoriaProducto categoria : categoriasDisponibles) {
            System.out.println(categoria.getDescripcion());
        }
    }
    
    public static void ejercicio2() {
        // BIBLIOTECA Y LIBROS
        
        // 1.
        Biblioteca biblio = new Biblioteca("biblioFranco");
        
        // 2.
        Autor a1 = new Autor("1", "Gabriel", "Argentina");
        Autor a2 = new Autor("2", "German", "Chile");
        Autor a3 = new Autor("3", "Amanda", "Uruguay");
        
        // 3.
        biblio.agregarLibro("1", "Primer libro", 1990, a1);
        biblio.agregarLibro("2", "Aventureros", 1998, a2);
        biblio.agregarLibro("3", "El buen mal", 2023, a3);
        biblio.agregarLibro("4", "El buen mal 2", 2025, a3);
        biblio.agregarLibro("5", "Segundo libro", 2018, a1);
        
        //4
        biblio.listarLibros();
        
        // 5.
        Libro libroBuscado = biblio.buscarLibroPorIsbn("2");
        libroBuscado.mostrarInfo();
        
        // 6.
        ArrayList<Libro> librosDel2000 = biblio.filtrarLibrosPorAnio(2025);
        for (Libro libro : librosDel2000) {
            libro.mostrarInfo();
        }
        
        // 7.
        biblio.eliminarLibro("5");
        biblio.listarLibros();
        
        // 8.
        System.out.println("Cantidad de libros de la biblioteca: " + biblio.obtenerCantidadLibros());
        
        //9.
        ArrayList<Autor> autoresDeBiblioteca = biblio.mostrarAutoresDisponibles();
        for (Autor autor : autoresDeBiblioteca) {
            autor.mostrarInfo();
        }
    }
    
    public static void ejercicio3() {
        // UNIVERSIDAD, PROFESOR Y CURSOS
        
        //1.
        Profesor profe1 = new Profesor("1", "Martin", "Filosofia");
        Profesor profe2 = new Profesor("2", "Leandro", "Historia");
        Profesor profe3 = new Profesor("3", "Roberta", "Informatica");
        
        Curso filosofia = new Curso("1", "Filosofia");
        Curso historia = new Curso("2", "Historia");
        Curso geografia = new Curso("3", "Geografia");
        Curso programacion = new Curso("4", "Programacion");
        Curso informatica = new Curso("5", "Informatica");
        
        // 2.
        Universidad utn = new Universidad("UTN");
        
        utn.agregarCurso(filosofia);
        utn.agregarCurso(historia);
        utn.agregarCurso(geografia);
        utn.agregarCurso(programacion);
        utn.agregarCurso(informatica);
        
        utn.agregarProfesor(profe1);
        utn.agregarProfesor(profe2);
        utn.agregarProfesor(profe3);
        
        // 3.
        utn.asignarProfesorACurso("1", "1"); // FILOSOFIA
        utn.asignarProfesorACurso("2", "2"); // HISTORIA
        utn.asignarProfesorACurso("3", "2"); // GEOGRAFIA
        utn.asignarProfesorACurso("4", "3"); // PROGRAMACION
        utn.asignarProfesorACurso("5", "3"); // INFORMATICA

        // 4.

        System.out.println("Cursos: ");
        utn.listarCursos();
        System.out.println("-------------------------------");
        
        System.out.println("Profesores: ");
        utn.listarProfesores();
        System.out.println("-------------------------------");
        
        // 5.
        informatica.setProfesor(profe1);
        informatica.mostrarInfo();
        for (Curso curso : profe1.getCursos()) {
            System.out.println(curso.getNombre());
        }
        
        // 6.
        utn.eliminarCurso("3");
        utn.listarCursos();
        utn.listarProfesores();
        
        // 7.
        utn.eliminarProfesor("2");
        //utn.listarProfesores();
        utn.listarCursos();

        // 8.
        for(Profesor prof : utn.getProfesores()) {
            System.out.println("Profesor: " + prof.getNombre());
            System.out.println("Cantidad de cursos: " + prof.cantidadDeCursos());
        }
    }
}
