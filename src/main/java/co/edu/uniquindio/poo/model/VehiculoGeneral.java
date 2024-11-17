package co.edu.uniquindio.poo.model;

public class VehiculoGeneral {

    public double numeroPasajeros;
    public double numeroPuertas;
    public double bolsasAire;

    public VehiculoGeneral(double numeroPasajeros, double numeroPuertas, double bolsasAire) {
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.bolsasAire = bolsasAire;
    }

    public double getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(double numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public double getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(double numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public double getBolsasAire() {
        return bolsasAire;
    }

    public void setBolsasAire(double bolsasAire) {
        this.bolsasAire = bolsasAire;
    }

}
