import java.util.Scanner;

public class JavaOperaciones {
    
    Scanner sc = new  Scanner(System.in);
    
    public void Mensaje1(){
    System.out.println("SOY EL MEJOR PROGRAMADOR!!");
    }
    
    public void Mensaje1_2(){
        System.out.println("-----------------------------------------------");
        int calificacion = 0;        
        calificacion = 80;
        if(calificacion >= 70)
          System.out.println("\nAprobado");
        else
          System.out.println("\nReprobado");
    }
    
    public void Suma () {
        System.out.println("\n-----------------------------------------------");
        int numero1 = 10;
        int numero2 = 20;
        
        int suma = numero1 + numero2;
        
        System.out.println("\nLa suma de los enteros es: " + suma);
    }
    
    public void Resta_Multiplicacion(){
        System.out.println("\n-----------------------------------------------");
        double numero1 = 50;
        double numero2 = 15;
        double numero3 = 36;
        
        double resta = numero1 - numero2 - numero3;
        double multiplicacion = numero1 * numero2 * numero3;
        System.out.println("La Resta de los enteros es: " + resta);
        System.out.println("La Multiplicacion de los enteros es: " + multiplicacion);
    }
    
    public void RetornarNumeros(){
       System.out.println("\n-----------------------------------------------");
       System.out.println("Ingrese un Entero para iterar \"n\" veces: ");
       int number = sc.nextInt();
       for(int i=0; i<=number; i++){
           System.out.println("\nNumero: "+i);
       }
    }
}
