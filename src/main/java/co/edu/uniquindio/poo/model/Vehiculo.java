package co.edu.uniquindio.poo.model;

public class Vehiculo {

    public String marca;
    public String modelo;
    public String codigo;
    public boolean nuevo;
    public int cambios;
    public int velocidadMax;
    public Transaccion transaccion;
    public Transmision tipoTransmision;

    public Vehiculo(String marca, String modelo, String codigo, boolean nuevo, int cambios, int velocidadMax,
            Transaccion transaccion, Transmision tipoTransmision) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
        this.nuevo = nuevo;
        this.cambios = cambios;
        this.velocidadMax = velocidadMax;
        this.transaccion = transaccion;
        this.tipoTransmision = tipoTransmision;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    public Transmision getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(Transmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

}
