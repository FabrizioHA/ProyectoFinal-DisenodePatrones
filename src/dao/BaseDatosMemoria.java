package dao;

import modelo.ListaLibros;
import modelo.ListaUsuarios;
import modelo.Prestamo;
import modelo.Devolucion;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BaseDatosMemoria implements IBasedeDatos {
    private static volatile BaseDatosMemoria instancia;

    private final ListaLibros listaLibros;
    private final ListaUsuarios listaUsuarios;
    private final Queue<Prestamo> colaPrestamos;
    private final List<Devolucion> listaDevoluciones;
    private final Stack<Devolucion> pilaDevoluciones;

    private BaseDatosMemoria() {
        this.listaLibros = new ListaLibros();
        this.listaUsuarios = new ListaUsuarios();
        this.colaPrestamos = new LinkedList<>();
        this.listaDevoluciones = new ArrayList<>();
        this.pilaDevoluciones = new Stack<>();
    }

    public static BaseDatosMemoria getInstance() {
        if (instancia == null) {
            synchronized (BaseDatosMemoria.class) {
                if (instancia == null) {
                    instancia = new BaseDatosMemoria();
                }
            }
        }
        return instancia;
    }

    public ListaLibros getListaLibros() {
        return listaLibros;
    }

    public ListaUsuarios getListaUsuarios() {
        return listaUsuarios;
    }

    public Queue<Prestamo> getColaPrestamos() {
        return colaPrestamos;
    }

    public List<Devolucion> getListaDevoluciones() {
        return listaDevoluciones;
    }

    public Stack<Devolucion> getPilaDevoluciones() {
        return pilaDevoluciones;
    }
}
