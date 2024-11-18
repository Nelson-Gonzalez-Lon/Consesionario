package co.edu.uniquindio.poo.model;

public class DeportivoHibrido extends Deportivo {

    private boolean enchufable;
    private boolean ligero;

    public DeportivoHibrido(double numeroPasajeros, double numeroPuertas, double bolsasAire, double caballosFuerza,
            double aceleracion0a100, boolean enchufable, boolean ligero) {
        super(numeroPasajeros, numeroPuertas, bolsasAire, caballosFuerza, aceleracion0a100);
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
