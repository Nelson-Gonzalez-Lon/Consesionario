package co.edu.uniquindio.poo.model;

public class VehiculoSencillo extends VehiculoGeneral {

    public boolean aireAcondicionado;
    public boolean abs;
    public boolean camaraReversa;

    public VehiculoSencillo(double numeroPasajeros, double numeroPuertas, double bolsasAire, boolean aireAcondicionado,
            boolean abs, boolean camaraReversa) {
        super(numeroPasajeros, numeroPuertas, bolsasAire);
        this.aireAcondicionado = aireAcondicionado;
        this.abs = abs;
        this.camaraReversa = camaraReversa;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

}
