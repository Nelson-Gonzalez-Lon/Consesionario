package co.edu.uniquindio.poo.model;

public class SedanElectrico extends Sedan {

    private double tiempoCarga;
    private double autonomia;

    public SedanElectrico(double numeroBolsasAire, boolean camaraColision, boolean camaraReversa,
            boolean asistentePermanenciaCarril, boolean sensoreTraficoCruzado, boolean velocidadCrucero,
            double tiempoCarga, double autonomia) {
        super(numeroBolsasAire, camaraColision, camaraReversa, asistentePermanenciaCarril, sensoreTraficoCruzado,
                velocidadCrucero);
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
