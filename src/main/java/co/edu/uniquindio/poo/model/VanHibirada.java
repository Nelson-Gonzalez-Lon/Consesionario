package co.edu.uniquindio.poo.model;

public class VanHibirada extends Van {

    private boolean enchufable;
    private boolean ligero;

    public VanHibirada(double numeroPasajeros, double numeroPuertas, double bolsasAire, boolean aireAcondicionado,
            boolean abs, boolean camaraReversa, double capacidadMaletero, boolean enchufable, boolean ligero) {
        super(numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, abs, camaraReversa, capacidadMaletero);
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
