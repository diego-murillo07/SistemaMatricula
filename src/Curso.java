
public class Curso {

    private String codigo;
    private String nombre;
    private int creditos;
    private String horario;

    public Curso(String codigo, String nombre, int creditos, String horario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.horario = horario;
    }
    
     public Curso() {
        this.codigo = "";
        this.nombre = "";
        this.creditos = 0;
        this.horario = "";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
     
     
    
    
}
