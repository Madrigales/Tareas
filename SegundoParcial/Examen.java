package segundoparcial;

public class Examen {

    public static void main(String[] args) {

    }

    public static class Persona {

        private String nombre;
        private String carrera;
        private int id;
        private int edad;
        private String deporte;

        public Persona() {
        }

        public Persona(String nombre, String carrera, int id, int edad, String deporte) {
            this.nombre = nombre;
            this.carrera = carrera;
            this.deporte = deporte;
            this.id = id;
            this.edad = edad;
         }
            
        
        public String getNombre() {
            return nombre;
        }

        public String getCarrera() {
            return carrera;
        }

        public int getId() {
            return id;
        }

        public int getEdad() {
            return edad;
        }

        public String getDeporte() {
            return deporte;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setDeporte(String deporte) {
            this.deporte = deporte;
        }

        }
    
        public static  class Estudiante extends Persona {

        }

        public static  class Deportista extends Persona {

        }
} 
