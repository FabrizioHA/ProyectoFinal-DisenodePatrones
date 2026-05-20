package servicio;

import modelo.Usuarios;
import modelo.Libros;

public class EntidadFactory implements IEntidadFactory {

    
    public Usuarios crearUsuario(String nombre, String apellidoP, String apellidoM, String telefono, int numeroActual) {
        String codigo = String.format("U%03d", numeroActual + 1);
        return new Usuarios(codigo, nombre, apellidoP, apellidoM, telefono);
    }


    public Libros crearLibro(String libroID, String titulo, String autor, String idioma, int paginas, int disponibles) {
        return new Libros(libroID, titulo, autor, idioma, paginas, disponibles);
    }
}
