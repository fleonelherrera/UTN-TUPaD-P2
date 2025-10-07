package pkg06_colecciones;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void setProfesor(Profesor profesor) {
        // SI EL PROFESOR DEL CURSO YA ES EL PROFESOR RECIBIDO POR PARAMETRO NO HACE NADA
        if (this.profesor == profesor) return;
        
        // SI EL CURSO YA TENIA UN PROFESOR, LO VAMOS A PISAR, POR LO QUE DEBEMOS ELIMINAR ESTE CURSO DE SU LISTA DE CURSOS
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        
        // AGREGAMOS EL PROFESOR AL CURSO
        this.profesor = profesor;
        
        // SI EL PROFESOR NO CONTIENE ESTE CURSO EN SU LISTA DE CURSOS LO AGREGAMOS
        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.agregarCurso(this);
        }
    }
    
    public Profesor getProfesor() {
        return profesor;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void mostrarInfo() {
        if (getProfesor() != null) {
            System.out.print("Codigo: " + getCodigo() + ", ");
            System.out.print("Nombre: " + getNombre() + ", ");
            System.out.println("Profesor/a: " + getProfesor().getNombre());
        } else {
            System.out.print("Codigo: " + getCodigo() + ", ");
            System.out.println("Nombre: " + getNombre());
        }
    }
    
    public boolean esElCurso(String codigo) {
        return this.codigo.equalsIgnoreCase(codigo);
    }
}
