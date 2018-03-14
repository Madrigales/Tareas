package proyectoexamen;

public final class Deportista extends Persona {
    private String deporte;
    private String equipo;

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    public Deportista(String nombre, String apellido, String domicilio, int edad, int id) {
        super(nombre, apellido, domicilio, edad, id);
    }
    
    public void MostrarInformacion() {
    
        System.out.println("DEPORTISTA \nNombre: " + getNombre() + " " + getApellido() +"\nDomicilio:" +              getDomicilio() + "\nEdad: " + getEdad() + "\nID: " + getId() + "\nDeporte: " + getDeporte() + "\nEquipo: "         + getEquipo());
        
    }

}
