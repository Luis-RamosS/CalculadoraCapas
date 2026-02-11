package dominio;

public class OperacionesTrigonometricas {

    double angulo;

    public OperacionesTrigonometricas(double angulo){
        this.angulo = Math.toRadians(angulo);
    }

    public double seno(){
        return Math.sin(angulo);
    }

    public double coseno(){
        return Math.cos(angulo);
    }

    public double tangente(){
        return Math.tan(angulo);
    }

    public double secante(){
        return 1 / Math.cos(angulo);
    }

    public double cotangente(){
        return 1 / Math.tan(angulo);
    }
}