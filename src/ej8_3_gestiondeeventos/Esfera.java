package ej8_3_gestiondeeventos;

public class Esfera extends FiguraGeometrica{
   protected double radio;
   
   protected Esfera(double r){
       radio = r;
       calcularVolumen();
       calcularSuperficie();
   }
   
   protected void calcularVolumen(){
       volumen = (4 * Math.PI * Math.pow(radio,3))/ 3;
   }
   
   protected void calcularSuperficie(){
       superficie = 4 * Math.PI * Math.pow(radio,2);
   }
   
}