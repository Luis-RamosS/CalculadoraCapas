package dominio;

public class OperacionesAritmeticas {
    double num1,num2;
    public OperacionesAritmeticas(double a, double b) {
        this.num1 = a;
        this.num2 = b;
    }
    public double sumar() {
        return num1+num2;
    }
    public double restar() {
        return num1-num2;
    }
    public double multiplicar() {
        return num1*num2;
    }
    public double dividir() {
        return num1/num2;
    }
}
