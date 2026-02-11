package servicios.imple;

import dominio.OperacionesLogaritmos;
import servicios.interfaces.ILogaritmicoServicio;

public class LogaritmicoServicio implements ILogaritmicoServicio {

    @Override
    public double logBase10(double a) {
        return new OperacionesLogaritmos(a).logBase10();
    }

    @Override
    public double logNatural(double a) {
        return new OperacionesLogaritmos(a).logNatural();
    }

    @Override
    public double logBaseN(double a, double base) {
        return new OperacionesLogaritmos(a,base).logBaseN();
    }
}
