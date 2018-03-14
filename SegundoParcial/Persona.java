
package proyectoexamen;

public class Persona {
     private String nombre;
     private String apellido;
     private String domicilio;
     private int    edad;
     private int    id;
     
     public Persona(String nombre, String apellido, String domicilio, int edad, int id){
         this.nombre = nombre;
         this.apellido = apellido;
         this.domicilio = domicilio;
         this.edad = edad;
         this.id = id;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     
     
      
    
}
