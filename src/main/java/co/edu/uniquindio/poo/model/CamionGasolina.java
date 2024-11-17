package co.edu.uniquindio.poo.model;

public class CamionGasolina extends Camion {

    public CamionGasolina(String marca, String modelo, String codigo, boolean nuevo, int cambios, int velocidadMax,
            Transaccion transaccion, Transmision tipoTransmision, double capacidadCarga, boolean aireAcondicionado,
            boolean frenosAire, boolean aBS, int numeroEjes, TamanoCamion tamañoCamion, double tiempoCarga,
            double autonomia) {
        super(marca, modelo, codigo, nuevo, cambios, velocidadMax, transaccion, tipoTransmision, capacidadCarga,
                aireAcondicionado, frenosAire, aBS, numeroEjes, tamañoCamion);
    }
    
}
