package co.edu.uniquindio.poo.model;

public class Camioneta extends VehiculoTodoTerreno {

    public boolean cuatroxcuatro;


    public Camioneta(double numeroPasajeros, double numeroPuertas, double bolsasAire, boolean aireAcondicionado,
            boolean abs, boolean camaraReversa, double capacidadMaletero, double numeroBolsasAire,
            boolean camaraColision, boolean asistentePermanenciaCarril, boolean sensoreTraficoCruzado,
            boolean velocidadCrucero, boolean cuatroxcuatro) {
        super(numeroPasajeros, numeroPuertas, bolsasAire, aireAcondicionado, abs, camaraReversa, capacidadMaletero,
                numeroBolsasAire, camaraColision, asistentePermanenciaCarril, sensoreTraficoCruzado, velocidadCrucero);
        this.cuatroxcuatro = cuatroxcuatro;
    }

    public boolean isCuatroxcuatro() {
        return cuatroxcuatro;
    }

    public void setCuatroxcuatro(boolean cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro;
    }

}
