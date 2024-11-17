package co.edu.uniquindio.poo.model;

public abstract class Servicio {

    public String codigo;

    public Servicio(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public abstract double calcularPrecio();
}
