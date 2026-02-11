package dominio;

public class OperacionesLogaritmos {
    double n,base;

    public OperacionesLogaritmos(double n){
        this.n = n;
    }

    public OperacionesLogaritmos(double n,double base){
        this.n = n;
        this.base = base;
    }

    public double logBase10(){
        return Math.log10(n);
    }

    public double logNatural(){
        return Math.log(n);
    }

    public double logBaseN(){
        return Math.log(n) / Math.log(base);
    }
}