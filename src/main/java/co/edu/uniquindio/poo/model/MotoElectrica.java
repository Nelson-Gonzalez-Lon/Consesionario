package co.edu.uniquindio.poo.model;

public class MotoElectrica {

    private double tiempoCarga;
    private double autonomia;

    public MotoElectrica(double tiempoCarga, double autonomia) {
        this.tiempoCarga = tiempoCarga;
        this.autonomia = autonomia;
    }

    public double getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(double tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

}
