public class VagoneMerci extends Vagone {
    private double volumeCarico;
    private double maxPeso;
    private double carico;

    public VagoneMerci() {
        super();
        volumeCarico = 0;
        maxPeso = 1;
        carico = 0;
    }

    public VagoneMerci(double wheight, String company, int year, double volume, double maxLoad, double load) {
        super(wheight, company, year);
        volumeCarico = volume;
        maxPeso = maxLoad;
        carico = load;
    }

    public double getVolume() {
        return volumeCarico;
    }

    public double getMaxPeso() {
        return maxPeso;
    }

    public double getCarico() {
        return carico;
    }

    public void setVolume(double volume) {
        volumeCarico = volume;
    }

    public void setMaxPeso(double maxLoad) {
        maxPeso = maxLoad;
    }

    public void setCarico(double load) {
        carico = load;
    }

    public double calcPeso() {
        return (carico + this.getPeso());
    }
}
