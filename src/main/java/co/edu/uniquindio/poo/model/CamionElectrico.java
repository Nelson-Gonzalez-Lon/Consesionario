package co.edu.uniquindio.poo.model;

public class CamionElectrico extends Camion {

    private double tiempoCarga;
    private double autonomia;

    public CamionElectrico(String marca, String modelo, String codigo, boolean nuevo, int cambios, int velocidadMax,
            Transaccion transaccion, Transmision tipoTransmision, double capacidadCarga, boolean aireAcondicionado,
            boolean frenosAire, boolean aBS, int numeroEjes, TamanoCamion tamañoCamion, double tiempoCarga,
            double autonomia) {
        super(marca, modelo, codigo, nuevo, cambios, velocidadMax, transaccion, tipoTransmision, capacidadCarga,
                aireAcondicionado, frenosAire, aBS, numeroEjes, tamañoCamion);
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
