package co.edu.uniquindio.poo.model;

public class Camion extends Vehiculo {

    private double capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenosAire;
    private boolean ABS;
    private int numeroEjes;
    private TamanoCamion tamañoCamion;

    public Camion(String marca, String modelo, String codigo, boolean nuevo, int cambios, int velocidadMax,
            Transaccion transaccion, Transmision tipoTransmision, double capacidadCarga,
            boolean aireAcondicionado, boolean frenosAire, boolean aBS, int numeroEjes, TamanoCamion tamañoCamion) {
        super(marca, modelo, codigo, nuevo, cambios, velocidadMax, transaccion, tipoTransmision);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosAire = frenosAire;
        ABS = aBS;
        this.numeroEjes = numeroEjes;
        this.tamañoCamion = tamañoCamion;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public TamanoCamion getTamañoCamion() {
        return tamañoCamion;
    }

    public void setTamañoCamion(TamanoCamion tamañoCamion) {
        this.tamañoCamion = tamañoCamion;
    }

}
