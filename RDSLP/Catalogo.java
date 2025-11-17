public class Grupo {
    private int idGrupo;
    private String nombre;
    private String descripcion;
    
    public Grupo(int idGrupo, String nombre, String descripcion) {
        this.idGrupo = idGrupo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public int getIdGrupo() { return idGrupo; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
} {
    
}
