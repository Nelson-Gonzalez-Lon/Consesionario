package co.edu.uniquindio.poo.model;

public class VehiculoTodoTerreno extends VehiculoAmplio {

    public double numeroBolsasAire;
    public boolean camaraColision;
    public boolean camaraReversa;
    public boolean asistentePermanenciaCarril;
    public boolean sensorTraficoCruzado;
    public boolean velocidadCrucero;

    public VehiculoTodoTerreno(double numeroPasajeros, double numeroPuertas, double bolsasAire,
            boolean aireAcondicionado, boolean abs, boolean camaraReversa, double capacidadMaletero,
            double numeroBolsasAire, boolean camaraColision, boolean asistentePermanenciaCarril,
            boolean sensoreTraficoCruzado, boolean velocidadCrucero) {
        super(numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, abs, camaraReversa, capacidadMaletero);
        this.numeroBolsasAire = numeroBolsasAire;
        this.camaraColision = camaraColision;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
        this.sensorTraficoCruzado = sensoreTraficoCruzado;
        this.velocidadCrucero = velocidadCrucero;
    }

    public double getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(double numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isCamaraColision() {
        return camaraColision;
    }

    public void setCamaraColision(boolean camaraColision) {
        this.camaraColision = camaraColision;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public boolean isAsistentePermanenciaCarril() {
        return asistentePermanenciaCarril;
    }

    public void setAsistentePermanenciaCarril(boolean asistentePermanenciaCarril) {
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    public boolean isSensoreTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    public void setSensoreTraficoCruzado(boolean sensoreTraficoCruzado) {
        this.sensorTraficoCruzado = sensoreTraficoCruzado;
    }

    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

}
