package co.edu.uniquindio.poo.model;

public class CamionHibrido extends Camion{

    private boolean enchufable;
    private boolean ligero;

    public CamionHibrido(String marca, String modelo, String codigo, boolean nuevo, int cambios, int velocidadMax,
            Transaccion transaccion, Transmision tipoTransmision, double capacidadCarga, boolean aireAcondicionado,
            boolean frenosAire, boolean aBS, int numeroEjes, TamanoCamion tamañoCamion, boolean enchufable,
            boolean ligero) {
        super(marca, modelo, codigo, nuevo, cambios, velocidadMax, transaccion, tipoTransmision, capacidadCarga,
                aireAcondicionado, frenosAire, aBS, numeroEjes, tamañoCamion);
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
