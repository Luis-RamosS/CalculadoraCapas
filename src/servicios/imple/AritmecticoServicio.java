package servicios.imple;

import dominio.OperacionesAritmeticas;
import servicios.interfaces.IAritmeticoServicio;

public class AritmecticoServicio implements IAritmeticoServicio {

    @Override
    public double sumar(double a, double b) {
        return new OperacionesAritmeticas(a, b).sumar();
    }

    @Override
    public double restar(double a, double b) {
        return new OperacionesAritmeticas(a, b).restar();
    }

    @Override
    public double multiplicar(double a, double b) {
        return new OperacionesAritmeticas(a, b).multiplicar();
    }

    @Override
    public double dividir(double a, double b) {
        return new OperacionesAritmeticas(a, b).dividir();
    }
}
