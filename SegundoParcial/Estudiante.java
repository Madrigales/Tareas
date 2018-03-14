
package proyectoexamen;


public final class Estudiante extends Persona {
    private String carrera;
    private String clases;
    private String Catedratico; 
    
    public Estudiante(String nombre, String apellido, String domicilio, int edad, int id) {
        super(nombre, apellido, domicilio, edad, id);
    }

    public String getCatedratico() {
        return Catedratico;
    }

    public void setCatedratico(String Catedratico) {
        this.Catedratico = Catedratico;
    }
    
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }
    
    public void MostrarInformacion() {
    
        System.out.println("ESTUDIANTE \nNombre: " + getNombre() + " " + getApellido() +"\nDomicilio:" +              getDomicilio() + "\nEdad: " + getEdad() + "\nID: " + getId() +"\nCarrera Universitaria: " + getCarrera() +        "\nClases: " + getClases() + "\nCatedrático: " + getCatedratico());
        
    }
}
