package pkg06_colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    
    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }
    
    public void agregarCurso(Curso c) {
        cursos.add(c);
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso cursoAAsignar = buscarCursoPorCodigo(codigoCurso);
        Profesor profesorAsignado = buscarProfesorPorId(idProfesor);
        cursoAAsignar.setProfesor(profesorAsignado);
    }
    
    public void listarProfesores() {
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }
    
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
    
    public void listarCursos() {
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        Profesor profesorBuscado = null;
        for (Profesor profesor : profesores) {
            if (profesor.esElProfesor(id)) {
                profesorBuscado = profesor;
            }
        }
        return profesorBuscado;
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        Curso cursoBuscado = null;
        for (Curso curso : cursos) {
            if (curso.esElCurso(codigo)) {
                cursoBuscado = curso;
            }
        }
        return cursoBuscado;
    }
    
    public void eliminarCurso(String codigo) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);
        if (cursoAEliminar.getProfesor() != null) {
            cursoAEliminar.setProfesor(null);
        }
        cursos.remove(cursoAEliminar);
    }
    
    public void eliminarProfesor(String id) {
        Profesor profesorAEliminar = buscarProfesorPorId(id);
        
        ArrayList<Curso> cursosDelProfesorAEliminar = new ArrayList<>(profesorAEliminar.getCursos());
        for (Curso curso : cursosDelProfesorAEliminar) {
            curso.setProfesor(null);
        }
        profesores.remove(profesorAEliminar);
    }
}
