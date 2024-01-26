public abstract class MezzoDiTrasporto {
    protected String marca;
    protected String modello;

    public MezzoDiTrasporto() {
        marca = "undefined";
        modello = "undefined";
    }

    public MezzoDiTrasporto(String brand, String model) {
        marca = brand;
        modello = model;
    }
}
