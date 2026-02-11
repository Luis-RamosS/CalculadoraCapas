package servicios.imple;

import dominio.OperacionesTrigonometricas;
import servicios.interfaces.ITrigonometricoServicio;

public class TrigonometricoServicio implements ITrigonometricoServicio {
    @Override
    public double seno(double grados) {
        return new OperacionesTrigonometricas(grados).seno();
    }

    @Override
    public double coseno(double grados) {
        return new OperacionesTrigonometricas(grados).coseno();
    }

    @Override
    public double tangente(double grados) {
        return new OperacionesTrigonometricas(grados).tangente();
    }

    @Override
    public double secante(double grados) {
        return new OperacionesTrigonometricas(grados).secante();
    }

    @Override
    public double cotangente(double grados) {
        return new OperacionesTrigonometricas(grados).cotangente();
    }
}
