
package OperacionesJava;

import jdk.nashorn.internal.parser.TokenType;

public class Main {

    public static void main(String[] args) {
        
    Carro carrito = new Carro();

    carrito.setMarca("TOYOTA");

    carrito.setColor("Gris Oscuro");

    carrito.setAnio (2018);

    carrito.setModelo ("3.0");
   
    System.out.println("Marca: " + carrito.getMarca() );

    System.out.println("Color: " + carrito.getColor() );

    System.out.println("Anio: " + carrito.getAnio() );

    System.out.println("Modelo: " + carrito.getModelo() );
      
    /*Aquí he instanciado los metodos para manejar el estado del carro, al seleccionar
    de forma secuencial los metodos 
    Estado(); el programa dira que el carro esta apagado
    Encender(); el programa dira que esta encendido
    Estado(); el programa dira que el carro esta encendido ya que al ejecutar el metodo encender  
    y luego el metodo Estado(); este almacena de forma logica la respuesta del metodo anterior.
    lo mismo seria si utilizara el metodo apagar en lugar del encendido.
    de esta forma condicional podemos controlar el estado del carro.
    */
    
    carrito.Estado();
    carrito.Encender();
    carrito.Estado();

    }
    
    public static class Carro {

    private String Color;

    private String Marca;

    private int Anio;

    private String Modelo;   
    
    private boolean encender = false;
    
    //Metodos get
    public String getColor(){

        return Color;

    }

    public String getMarca(){

        return Marca;

    }

    public int getAnio(){

        return Anio;

    }

    public String getModelo(){

        return Modelo;

    }    
    
    //Metodos Set
    public void setMarca(String Marca){

        this.Marca = Marca;

    }
   
    
    public void setColor(String Color){

        this.Color = Color;

    }

    public void setAnio(int Anio){

        this.Anio = Anio;

    }

    public void setModelo(String Modelo){

        this.Modelo = Modelo;

    }
    
    public void Encender(){
    this.encender = true;
    System.out.println("El Carro esta encendido");
    }
    
    public void Apagar(){
    this.encender = false;
    System.out.println("El Carro esta apagado");
    }

    
    public void Estado(){
        if (this.encender == true) 
        System.out.println("El Carro esta encendido");
        else
        System.out.println("El Carro esta apagado");
    }
 }

}
