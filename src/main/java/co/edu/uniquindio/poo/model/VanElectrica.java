package co.edu.uniquindio.poo.model;

public class VanElectrica extends Van {

    private double tiempoCarga;
    private double autonomia;

    public VanElectrica(double numeroPasajeros, double numeroPuertas, double bolsasAire, boolean aireAcondicionado,
            boolean abs, boolean camaraReversa, double capacidadMaletero, double tiempoCarga, double autonomia) {
        super(numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, abs, camaraReversa, capacidadMaletero);
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
