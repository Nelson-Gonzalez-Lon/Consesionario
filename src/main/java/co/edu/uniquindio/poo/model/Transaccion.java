package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Transaccion {

    private int PrecioTotal;
    private String codigo;
    private LocalDate fechaTransacion;
    private Servicio servicioDado;

    public Transaccion(int precioTotal, String codigo, LocalDate fechaTransacion, Servicio servicioDado) {
        PrecioTotal = precioTotal;
        this.codigo = codigo;
        this.fechaTransacion = fechaTransacion;
        this.servicioDado = servicioDado;
    }

    public int getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        PrecioTotal = precioTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaTransacion() {
        return fechaTransacion;
    }

    public void setFechaTransacion(LocalDate fechaTransacion) {
        this.fechaTransacion = fechaTransacion;
    }

    public Servicio getServicioDado() {
        return servicioDado;
    }

    public void setServicioDado(Servicio servicioDado) {
        this.servicioDado = servicioDado;
    }

}
