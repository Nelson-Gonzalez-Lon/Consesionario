package co.edu.uniquindio.poo.model;

public class Deportivo extends VehiculoGeneral {

    private double caballosFuerza;
    private double aceleracion0A100;

    public Deportivo(double numeroPasajeros, double numeroPuertas, double bolsasAire, double caballosFuerza,
            double aceleracion0a100) {
        super(numeroPasajeros, numeroPuertas, bolsasAire);
        this.caballosFuerza = caballosFuerza;
        this.aceleracion0A100 = aceleracion0a100;
    }

    public double getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(double caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public double getAceleracion0A100() {
        return aceleracion0A100;
    }

    public void setAceleracion0A100(double aceleracion0a100) {
        aceleracion0A100 = aceleracion0a100;
    }

}
