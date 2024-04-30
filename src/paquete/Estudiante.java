package paquete;

public class Estudiante {
//Inicializo variables que van a componer al objeto/clase.
    private String nombre;
    private int edad;


//Constructor para la clase Estudiante.
    public Estudiante (String nombre, int edad) {
        //Igualo los valores de la clase a los valores que el constructor va a requerir.
        this.nombre = nombre;
        this.edad = edad;
    }

//Inicialización de Getters y setters para las variables de la clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

//Inicialización del método toString para la clase
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
