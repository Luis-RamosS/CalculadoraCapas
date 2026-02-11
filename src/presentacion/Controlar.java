package presentacion;


import servicios.imple.AritmecticoServicio;
import servicios.imple.LogaritmicoServicio;
import servicios.imple.TrigonometricoServicio;
import servicios.interfaces.IAritmeticoServicio;
import servicios.interfaces.ILogaritmicoServicio;
import servicios.interfaces.ITrigonometricoServicio;

import java.util.Scanner;

public class Controlar {

    Menu m = new Menu();
    Scanner sc = new Scanner(System.in);

    public void controlarPrincipal(){
        int opc;

        do{
            m.menuPrincipal();
            System.out.print("Seleccione una opcion: ");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    controlarAritmeticas();
                    break;
                case 2:
                    controlarLogaritmos();
                    break;
                case 3:
                    controlarTrigonometricas();
                    break;
                case -1:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opc != -1);
    }

    public void controlarAritmeticas(){
        int opc;
        double n1,n2;

        do{
            m.menuAritmeticas();
            System.out.print("Seleccione una opcion: ");
            opc = sc.nextInt();

            if(opc != -1){
                System.out.print("Ingrese el primer numero: ");
                n1 = sc.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                n2 = sc.nextDouble();

                IAritmeticoServicio oa = new AritmecticoServicio();

                switch(opc){
                    case 1:
                        System.out.println("Resultado: " + oa.sumar(n1,n2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + oa.restar(n1,n2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + oa.multiplicar(n1,n2));
                        break;
                    case 4:
                        if(n2==0){
                            System.out.println("No se puede dividir entre 0");
                        }else {
                            System.out.println("Resultado: " + oa.dividir(n1, n2));
                        }
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }
        }while(opc != -1);
    }

    public void controlarLogaritmos(){
        int opc;
        double n,base;

        do{
            m.menuLogaritmos();
            System.out.print("Seleccione una opcion: ");
            opc = sc.nextInt();

            ILogaritmicoServicio ol = new LogaritmicoServicio();

            if(opc != -1){
                System.out.print("Ingrese el numero: ");
                n = sc.nextDouble();

                switch(opc){
                    case 1:
                        System.out.println("Resultado: " + ol.logBase10(n));
                        break;
                    case 2:
                        System.out.println("Resultado: " + ol.logNatural(n));
                        break;
                    case 3:
                        System.out.print("Ingrese la base: ");
                        base = sc.nextDouble();
                        System.out.println("Resultado: " + ol.logBaseN(n,base));
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }
        }while(opc != -1);
    }

    public void controlarTrigonometricas(){
        int opc;
        double angulo;

        do{
            m.menuTrigonometricas();
            System.out.print("Seleccione una opcion: ");
            opc = sc.nextInt();

            if(opc != -1){
                System.out.print("Ingrese el angulo en grados: ");
                angulo = sc.nextDouble();

                ITrigonometricoServicio ot = new TrigonometricoServicio();

                switch(opc){
                    case 1:
                        System.out.println("Resultado: " + ot.seno(angulo));
                        break;
                    case 2:
                        System.out.println("Resultado: " + ot.coseno(angulo));
                        break;
                    case 3:
                        System.out.println("Resultado: " + ot.tangente(angulo));
                        break;
                    case 4:
                        System.out.println("Resultado: " + ot.secante(angulo));
                        break;
                    case 5:
                        System.out.println("Resultado: " + ot.cotangente(angulo));
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }
        }while(opc != -1);
    }
}
