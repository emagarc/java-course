public class Automovil {
    private String marca;
    private String modelo;
    private int anioFabricacion;

    public Automovil() {}

//    constructor lleno
    Automovil(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    void acelerar() {
        System.out.println("Acelerando");
    }

    String frenar() {
        return "Frenando";
    }
}
