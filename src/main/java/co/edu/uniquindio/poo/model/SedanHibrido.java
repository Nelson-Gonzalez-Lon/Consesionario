package co.edu.uniquindio.poo.model;

public class SedanHibrido extends Sedan {

    private boolean enchufable;
    private boolean ligero;

    public SedanHibrido(double numeroBolsasAire, boolean camaraColision, boolean camaraReversa,
            boolean asistentePermanenciaCarril, boolean sensoreTraficoCruzado, boolean velocidadCrucero,
            boolean enchufable, boolean ligero) {
        super(numeroBolsasAire, camaraColision, camaraReversa, asistentePermanenciaCarril, sensoreTraficoCruzado,
                velocidadCrucero);
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
