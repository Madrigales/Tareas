
package proyectoexamen;


public class Herencia_Encapsulacion_Polimorfismo {

    public static void main(String[] args) {
        Estudiante objestudiante = new Estudiante("Ceily", "Araya Acevedo", "La 36 Guaymas", 20, 521145);
        objestudiante.setCarrera("Ingenieria en Producción Industrial");
        objestudiante.setClases("Programacion Orientada a Objetos");
        objestudiante.setCatedratico("Master Arnold Gutierrez");
        objestudiante.MostrarInformacion();
        
        System.out.println("\n");
        
        Deportista objDeportista = new Deportista("Diana", "Madrigales", "La 36 Guaymas", 21, 152234);
        objDeportista.setDeporte("Futboll Soccer");
        objDeportista.setEquipo("UTH-FC");
        objDeportista.MostrarInformacion();
        
    }
    
}
