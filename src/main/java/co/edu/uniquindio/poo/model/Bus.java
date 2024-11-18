package co.edu.uniquindio.poo.model;

public class Bus extends VehiculoAmplio {

    public double numeroEjes;
    public double salidasEmergencia;

    public Bus(double numeroPasajeros, double numeroPuertas, double bolsasAire, boolean aireAcondicionado, boolean abs,
            boolean camaraReversa, double capacidadMaletero, double numeroEjes, double salidasEmergencia) {
        super(numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, abs, camaraReversa, capacidadMaletero);
        this.numeroEjes = numeroEjes;
        this.salidasEmergencia = salidasEmergencia;
    }

    public double getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(double numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public double getSalidasEmergencia() {
        return salidasEmergencia;
    }

    public void setSalidasEmergencia(double salidasEmergencia) {
        this.salidasEmergencia = salidasEmergencia;
    }

}
