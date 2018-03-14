
package OperacionesJava;

import javax.swing.JOptionPane;

public class Operaciones {
    //Atributos de la clase
    //Atributos de el metodo suma y mensaje2
    int nota = 0;
    int numero1;
    int numero2;
    //Atributos para el metodo Resta_Multiplicacion.
    double num1;
    double num2;
    double num3;
    
    //Metodos de la clase
    public void mensaje(){
    System.out.println("Soy el mejor programador");
    }
    
    public void mensaje2(){
        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota: "));
        if(nota >= 70)
          System.out.println("Aprobado");
        else
          System.out.println("Reprobado");
    }
    
    public void suma () {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Igrese el Primer Numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Igrese el Segundo Numero: "));
        
        int suma = numero1 + numero2;
        
        System.out.println("La suma es: " + suma);
    }
    
    public void Resta_Multiplicacion(){
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Igrese el Primer Numero: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Igrese el Segundo Numero: "));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Igrese el Tercer Numero: "));
        
        double resta = num1 - num2 - num3;
        double multiplicacion = num1 * num2 * num3;
         System.out.println("La Resta es: " + resta);
         System.out.println("La Multiplicacion es: " + multiplicacion);
    }
    
    public void RetornarNumeros(){
       int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
       for(int i=0; i<=x; i++){
           System.out.println("\nNumeros: "+i);
       }
    }
}
