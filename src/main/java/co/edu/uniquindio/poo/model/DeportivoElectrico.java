package co.edu.uniquindio.poo.model;

public class DeportivoElectrico extends Deportivo {

    private double tiempoCarga;
    private double autonomia;

    public DeportivoElectrico(double numeroPasajeros, double numeroPuertas, double bolsasAire, double caballosFuerza,
            double aceleracion0a100, double tiempoCarga, double autonomia) {
        super(numeroPasajeros, numeroPuertas, bolsasAire, caballosFuerza, aceleracion0a100);
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
