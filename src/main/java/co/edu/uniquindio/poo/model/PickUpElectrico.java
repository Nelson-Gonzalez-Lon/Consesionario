package co.edu.uniquindio.poo.model;

public class PickUpElectrico extends PickUp {

    private double tiempoCarga;
    private double autonomia;

    public PickUpElectrico(double numeroPasajeros, double numeroPuertas, double bolsasAire, boolean aireAcondicionado,
            boolean abs, boolean camaraReversa, boolean cuatroxcuatro, double capacidadCarga, double tiempoCarga,
            double autonomia) {
        super(numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, abs, camaraReversa, cuatroxcuatro,
                capacidadCarga);
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
