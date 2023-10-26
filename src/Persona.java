public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String profesion;
    private Boolean bilingue;

    public Persona() {}

    Persona(String nombre, String apellido, int edad, String profesion, Boolean bilingue) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.profesion = profesion;
        this.bilingue = bilingue;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Boolean getBilingue() {
        return bilingue;
    }

    public void setBilingue(Boolean bilingue) {
        this.bilingue = bilingue;
    }

    public void Saludar() {
        System.out.println("Hola buen dia, mi nombre es: " + this.nombre);
    }

    public void SoyBilingue() {
        if (this.bilingue) {
            System.out.println("Soy bilingue");
        } else {
            System.out.println("No soy bilingue");
        }
    }
}
