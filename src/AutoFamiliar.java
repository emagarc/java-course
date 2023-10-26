public class AutoFamiliar extends Automovil {
    private int cantidadAsientos;

    public AutoFamiliar() {}

    public AutoFamiliar(String marca, String modelo, int anioFabricacion, int cantidadAsientos) {
        super(marca, modelo, anioFabricacion);
        this.cantidadAsientos = cantidadAsientos;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar muy lento");
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
}
