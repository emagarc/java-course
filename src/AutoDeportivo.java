public class AutoDeportivo extends Automovil {
    private boolean esConvertible;

    public AutoDeportivo() { }

    public AutoDeportivo(String marca, String modelo, int anioFabricacion, boolean esConvertible) {
        super(marca, modelo, anioFabricacion);
        this.esConvertible = esConvertible;
    }

    public boolean isEsConvertible() {
        return esConvertible;
    }

    public void setEsConvertible(boolean esConvertible) {
        this.esConvertible = esConvertible;
    }
}
