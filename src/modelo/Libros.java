package modelo;

public class Libros {
    private String libroID;
    private String titulo;
    private String autor;
    private String idioma;
    private int paginas;
    private int disponibles;

    public Libros(String libroID, String titulo, String autor,
                 String idioma, int paginas, int disponibles) {

        this.libroID = libroID;
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.paginas = paginas;
        this.disponibles = disponibles;
    }

    public String getLibroID() { return libroID; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIdioma() { return idioma; }
    public int getPaginas() { return paginas; }
    public int getDisponibles() { return disponibles; }
    
}

