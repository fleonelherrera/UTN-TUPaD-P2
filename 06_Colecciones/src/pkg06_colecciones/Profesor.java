package pkg06_colecciones;

import java.util.ArrayList;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos = new ArrayList<>();
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    public void agregarCurso(Curso c) {
        // SI NO SE TIENE EL CURSO EN LA LISTA LO AGREGAMOS
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            
            // SI EL PROFESOR DEL CURSO AGREGADO NO ES THIS, LO SETEAMOS
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso c) {
        // SI EL PROFESOR DEL CURSO A ELIMINAR ES THIS, LO SETEAMOS EN NULO
        if (cursos.remove(c) && c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }
    
    public void listarCursos() {
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    
    public int cantidadDeCursos() {
        return cursos.size();
    }
    
    public void mostrarInfo() {
        System.out.print("Id: " + getId() + ", ");
        System.out.print("Nombre: " + getNombre() + ", ");
        System.out.print("Especialidad: " + getEspecialidad() + ", ");
        System.out.println("Cantidad de cursos: " + cursos.size());
        System.out.println("Cursos: ");
        for (Curso c : cursos) {
            System.out.println(c.getNombre());
        }
    }
    
    public boolean esElProfesor(String id) {
        return getId().equals(id);
    }
}
