package segundoparcial;


public class SegundoParcial {
    
    public static void main(String[] args) {
     /*En esta parte del codigo se hace la creacion de los objetos dependientes
       de cada clase y luego la instancias de cada uno de los metodos que estan
       dentro de la SuperClase Carro y las Subclases subClaseCarro1, subClaseCarro2 y 
       subClaseCarro3*/
     System.out.println("Informacion para el Carro1");
     subClaseCarro1 carro1 = new subClaseCarro1();
     carro1.mostrarInformacionCarro();
     carro1.metodocarro1();
     
     System.out.println("\nInformacion para el Carro2");
     subClaseCarro2 carro2 = new subClaseCarro2();
     carro2.mostrarInformacionCarro();
     carro2.metodocarro2();
     
     System.out.println("\nInformacion para el Carro3");
     subClaseCarro3 carro3 = new subClaseCarro3();
     carro3.mostrarInformacionCarro();
     carro3.metodocarro3();
    }
    
    public static class Carro {
    /*Creacion de cada una de las variables a utilizar como parametros de los
      metodos de las clases, "la informacion basica de el automovil"*/
    private String marca;
    private String color;
    private String modelo;
    private String tipo;
    private int anio;
    
    
    public Carro(){
        /*Me apoye en los codigos de los modulos de desarrollo*/
        /*
            Este constructor por defecto esta vacio, puede utilizarse
            para la inicializacion de componentes de la clase, se demostrara
            su uso en las subclases que hereden a esta clase.
         */
    }
    
    
    /*Constructor con la sobrecarga de inicializacion de la superclase Carro*/
    public Carro (String marca, String color, String modelo, String tipo, int anio)  {
        
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.tipo = tipo;
        this.anio = anio;    
    }
    
     /*
        Declaracion de los getters y setters
        de cada variable miembro de la clase.
     */
    
        //Metodos get
        public String getMarca() {
            return marca;
        }

        public String getColor() {
            return color;
        }

        public String getModelo() {
            return modelo;
        }

        public String getTipo() {
            return tipo;
        }

        public int getAnio() {
            return anio;
        }
        
        //Metodos set
        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }
        
        /*Metodo perteneciente a la superclase para poder mostrar la informacion
          al instanciarlo desde el objeto creado en el metodo principal main*/
        public void mostrarInformacionCarro(){
            System.out.println("Marca: " + marca );
            System.out.println("Modelo: " + modelo );
            System.out.println("Tipo: " + tipo );
        }
    }
    
    public static class subClaseCarro1 extends Carro {
         /*
            Inicializacion de la clase subClaseCarro1 mediante
            los setters definidos en la superclase
         */ 
        public subClaseCarro1(){
        setMarca("Toyota");
        setModelo("Hilux 3.0");
        setTipo("Lujo");
        }
        
        public void metodocarro1(){
        setColor("El Color del Carro1 es rojo");
        System.out.println(getColor());
        
        setAnio(2017);
        System.out.println("Año: " + getAnio());
        }
    }
    
    public static class subClaseCarro2 extends Carro { 
        /*
            Inicializacion de la clase subClaseCarro2 mediant
            los setters definidos en la superclase
         */ 
        public subClaseCarro2(){
        setMarca("Nissan");
        setModelo("Frontier");
        setTipo("PICKUP");
        }
        
        public void metodocarro2(){
        setColor("El Color del Carro1 es rojo");
        System.out.println(getColor());
        
        setAnio(2018);
        System.out.println("Año: " + getAnio());
        }
    }
    
    public static class subClaseCarro3 extends Carro {
        /*
            Inicializacion de la clase subClaseCarro3 mediante
            los setters definidos en la superclase
         */ 
        public subClaseCarro3(){
        setMarca("Ford");
        setModelo("Focus");
        setTipo("Turismo");
        }
        
        public void metodocarro3(){
        setColor("El Color del Carro2 es Negro");
        System.out.println(getColor());
        
        setAnio(2018);
        System.out.println("Año: " + getAnio());
        }
    }
    
    }
    
