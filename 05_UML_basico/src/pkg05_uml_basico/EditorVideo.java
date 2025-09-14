package pkg05_uml_basico;

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render renderizado = new Render(formato);
        renderizado.setProyecto(proyecto);

        System.out.println("Se renderizo el proyecto " + renderizado.getProyecto());
   }
}
