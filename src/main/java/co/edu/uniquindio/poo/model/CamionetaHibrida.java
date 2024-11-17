package co.edu.uniquindio.poo.model;

public class CamionetaHibrida extends Camioneta {

    private boolean enchufable;
    private boolean ligero;

    
    public CamionetaHibrida(double numeroPasajeros, double numeroPuertas, double bolsasAire, boolean aireAcondicionado,
            boolean abs, boolean camaraReversa, double capacidadMaletero, double numeroBolsasAire,
            boolean camaraColision, boolean asistentePermanenciaCarril, boolean sensoreTraficoCruzado,
            boolean velocidadCrucero, boolean cuatroxcuatro, boolean enchufable, boolean ligero) {
        super(numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, abs, camaraReversa, capacidadMaletero,
                numeroBolsasAire, camaraColision, asistentePermanenciaCarril, sensoreTraficoCruzado, velocidadCrucero,
                cuatroxcuatro);
        this.enchufable = enchufable;
        this.ligero = ligero;
    }

    public boolean isEnchufable() {
        return enchufable;
    }

    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }

    public boolean isLigero() {
        return ligero;
    }

    public void setLigero(boolean ligero) {
        this.ligero = ligero;
    }

}
