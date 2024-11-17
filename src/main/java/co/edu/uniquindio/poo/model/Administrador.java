package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Administrador extends Usuario {

    private LinkedList<Reporte> listaReportes;

    public Administrador(String nombre, String id, String clave, String correo, String preguntaRecuperación,
            String palabraRecuperación, LinkedList<Reporte> listaReportes) {
        super(nombre, id, clave, correo, preguntaRecuperación, palabraRecuperación);
        this.listaReportes = listaReportes;
    }

    public LinkedList<Reporte> getListaReportes() {
        return listaReportes;
    }

    public void setListaReportes(LinkedList<Reporte> listaReportes) {
        this.listaReportes = listaReportes;
    }
 
}
