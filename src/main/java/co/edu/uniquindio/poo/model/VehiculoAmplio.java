package co.edu.uniquindio.poo.model;

public class VehiculoAmplio extends VehiculoSencillo {

    public double capacidadMaletero;

    public VehiculoAmplio(double numeroPasajeros, double numeroPuertas, double bolsasAire, boolean aireAcondicionado,
            boolean abs, boolean camaraReversa, double capacidadMaletero) {
        super(numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, abs, camaraReversa);
        this.capacidadMaletero = capacidadMaletero;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

}
