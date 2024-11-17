package co.edu.uniquindio.poo.model;

public class MotoHibrida extends Moto {

    private boolean enchufable;
    private boolean ligero;

    public MotoHibrida(String marca, String modelo, String codigo, boolean nuevo, int cambios, int velocidadMax,
            Transaccion transaccion, Transmision tipoTransmision, boolean enchufable, boolean ligero) {
        super(marca, modelo, codigo, nuevo, cambios, velocidadMax, transaccion, tipoTransmision);
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
