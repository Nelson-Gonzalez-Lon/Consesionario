package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;

public class Reporte {

    private String codigo;
    private LocalDate fechaRegistro;
    private LinkedList<Transaccion> listaTransacciones;

    public Reporte(String codigo, LocalDate fechaRegistro, LinkedList<Transaccion> listaTransacciones) {
        this.codigo = codigo;
        this.fechaRegistro = fechaRegistro;
        this.listaTransacciones = listaTransacciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LinkedList<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setListaTransacciones(LinkedList<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }

}
