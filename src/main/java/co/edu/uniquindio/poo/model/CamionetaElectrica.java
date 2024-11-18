package co.edu.uniquindio.poo.model;

public class CamionetaElectrica extends Camioneta {

    private double tiempoCarga;
    private double autonomia;

    
    public CamionetaElectrica(double numeroPasajeros, double numeroPuertas, double bolsasAire,
            boolean aireAcondicionado, boolean abs, boolean camaraReversa, double capacidadMaletero,
            double numeroBolsasAire, boolean camaraColision, boolean asistentePermanenciaCarril,
            boolean sensoreTraficoCruzado, boolean velocidadCrucero, boolean cuatroxcuatro, double tiempoCarga,
            double autonomia) {
        super(numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, abs, camaraReversa, capacidadMaletero,
                numeroBolsasAire, camaraColision, asistentePermanenciaCarril, sensoreTraficoCruzado, velocidadCrucero,
                cuatroxcuatro);
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
