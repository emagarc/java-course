public class Persona {
    String nombre;
    String apellido;
    int edad;
    String profesion;
    Boolean bilingue;

    public Persona() {}

    Persona(String nombre, String apellido, int edad, String profesion, Boolean bilingue) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.profesion = profesion;
        this.bilingue = bilingue;
    }

    void Saludar() {
        System.out.println("Hola buen dia, mi nombre es: " + this.nombre);
    }

    void SoyBilingue() {
        if (this.bilingue) {
            System.out.println("Soy bilingue");
        } else {
            System.out.println("No soy bilingue");
        }
    }
}
