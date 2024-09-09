package ej8_3_gestiondeeventos;

public class Piramide extends FiguraGeometrica{
    protected double base, altura, apotema;
    
    protected Piramide(double b, double alt, double apot){
        base = b;
        altura = alt;
        apotema = apot;
        calcularVolumen();
        calcularSuperficie();
    }
    
    protected void calcularVolumen(){
        volumen = (Math.pow(base,2) * altura)/3;
    }
    
    protected void calcularSuperficie(){
        superficie = base * ((2 * apotema) + base);
    }
}