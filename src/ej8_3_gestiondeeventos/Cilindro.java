package ej8_3_gestiondeeventos;

public class Cilindro extends FiguraGeometrica{
    protected double radio, altura;
    
    protected Cilindro(double r, double alt){
        radio = r;
        altura = alt;
        calcularVolumen();
        calcularSuperficie();
    }
    
    protected void calcularVolumen(){
        volumen = Math.PI * altura * Math.pow(radio,2);
    }
    
    protected void calcularSuperficie(){
        superficie = 2 * Math.PI * radio * (radio + altura);
    }
    
}