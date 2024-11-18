package co.edu.uniquindio.poo.model;

public class PickUp extends VehiculoSencillo {

    public boolean cuatroxcuatro;
    public double capacidadCarga;

    public PickUp(double numeroPasajeros, double numeroPuertas, double bolsasAire, boolean aireAcondicionado,
            boolean abs, boolean camaraReversa, boolean cuatroxcuatro, double capacidadCarga) {
        super(numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, abs, camaraReversa);
        this.cuatroxcuatro = cuatroxcuatro;
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isCuatroxcuatro() {
        return cuatroxcuatro;
    }

    public void setCuatroxcuatro(boolean cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

}
