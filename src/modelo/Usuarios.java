package modelo;

public class Usuarios {
    private String codigo;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String telefono;

    public Usuarios(String codigo, String nombre, String apellidoP, String apellidoM, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
    }

    public String getCodigo() { return codigo; }    
    public String getNombre() { return nombre; }
    public String getApellidoP() { return apellidoP; }
    public String getApellidoM() { return apellidoM; }
    public String getTelefono() { return telefono; }
    
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellidoP(String apellidoP) { this.apellidoP = apellidoP; }
    public void setApellidoM(String apellidoM) { this.apellidoM = apellidoM; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}


