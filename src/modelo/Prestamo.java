package modelo;

public class Prestamo {
    private static int contador = 1;
    
    private int solicitudID;
    private String UsuarioID;
    private String LibroID;

    public Prestamo(String usuarioID, String libroID) {
        this.solicitudID = contador++;
        this.UsuarioID = usuarioID;
        this.LibroID = libroID;
    }
    
    public int getSolicitudID() { return solicitudID; }
    public String getUsuarioID() { return UsuarioID; }
    public String getLibroID() { return LibroID; }
}


