
package OperacionesJava;

public class Examen1 {

    public static void main(String[] args) {
       Estudiante estudiante = new Estudiante();       
      
        estudiante.setNombre("Marlon Cruz");
        estudiante.setEdad(21);
        estudiante.setCuenta(2015100408);
        estudiante.setCarrera("Ingenieria en Computacion");
        System.out.println("El Nombre del Primer Estudiante es: " + estudiante.getNombre());
        System.out.println("la Edad del Primer Estudiante es: " + estudiante.getEdad());
        System.out.println("El Numero de Cuenta del Primer Estudiante es: " + estudiante.getCuenta());
        System.out.println("La Carrera que Estudia el Primer Estudiante es: " + estudiante.getCarrera());
        System.out.println("\n");        
        System.out.println("---------------------------------------------------------------------");
        
        estudiante.setNombre("Maria Gutierrez");
        estudiante.setEdad(24);
        estudiante.setCuenta(2013056308);
        estudiante.setCarrera("Licenciatura en Gerencia de Negocios");
        System.out.println("El Nombre del Segundo Estudiante es: " + estudiante.getNombre());
        System.out.println("la Edad del Primer Estudiante es: " + estudiante.getEdad());
        System.out.println("El Numero de Cuenta del Primer Estudiante es: " + estudiante.getCuenta());
        System.out.println("La Carrera que Estudia el Primer Estudiante es: " + estudiante.getCarrera());
        System.out.println("\n");
        System.out.println("---------------------------------------------------------------------");
        
        estudiante.setNombre("Joel Acevedo");
        estudiante.setEdad(20);
        estudiante.setCuenta(2012630408);
        estudiante.setCarrera("Ingenieria en Electronica");
        System.out.println("El Nombre del Tercer Estudiante es: " + estudiante.getNombre());
        System.out.println("la Edad del Primer Estudiante es: " + estudiante.getEdad());
        System.out.println("El Numero de Cuenta del Primer Estudiante es: " + estudiante.getCuenta());
        System.out.println("La Carrera que Estudia el Primer Estudiante es: " + estudiante.getCarrera());
        System.out.println("---------------------------------------------------------------------");
        
        System.out.println("\nEl Horario de Los Estudiantes\b");
        estudiante.HorarioEstudiantes();
    }
    
    public static class Estudiante {
    private String Nombre;
    private int Edad;
    private int Cuenta;
    private String Carrera;
    
    
    public String getNombre(){
        return Nombre;
    }
    
    public int getEdad(){
       return Edad;
    }
    
    public int getCuenta(){
        return  Cuenta;
    }
    
    public String getCarrera(){
        return Carrera;
    }
    
    
    public void setNombre(String Nombre){
    this.Nombre = Nombre;
    }
    
    public void setEdad(int Edad){
     this.Edad = Edad;
    }
    
    public void setCuenta(int Cuenta){
    this.Cuenta = Cuenta;
    }
    
    public void setCarrera(String Carrera){
    this.Carrera = Carrera;
    }
    
    public void HorarioEstudiantes(){
    String horario [] = new String[3];
    System.out.println(horario[0] = "La Hora de Entrada Primer Alumno es a las 8:00 am a 12pm");
    System.out.println(horario[1] = "La Hora de Entrada Primer Alumno es a las 12:00 am a 4pm");
    System.out.println(horario[2] = "La Hora de Entrada Primer Alumno es a las 4:00 pm a 8pm");
    }
    
    }
    
    }
    

