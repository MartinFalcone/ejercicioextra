/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario 
los dos números y los ingresa en los atributos del objeto. 
Después, a través de otro método calcular y devolver la distancia que existe 
entre los dos puntos que existen en la clase Puntos. Para conocer como calcular
la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package extra2guia7;

import Entidades.Puntos;
import java.util.Scanner;

public class Extra2guia7 {
    
    public static void main(String[] args) {
       
         //Puntos P1 = new Puntos();
         //P1.crearPuntos();
         
         //System.out.println("Distancia: " + P1.calcular());
         
         crearPuntosMain();
    }
    
    public static void crearPuntosMain(){
        Scanner leer = new Scanner(System.in);
     
        Puntos puntos1= new Puntos();
        
        System.out.println("ingresar X1: ");
        setX1(leer.nextDouble());
        System.out.println("ingresar Y1: ");
        setY1(leer.nextDouble());
        System.out.println("ingresar X2: ");
        setX2(leer.nextDouble());
        System.out.println("ingresar Y2: ");
        setY2(leer.nextDouble());
        
    }
   
}

