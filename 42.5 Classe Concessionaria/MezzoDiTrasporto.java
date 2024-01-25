public abstract class MezzoDiTrasporto {
    private String marca;
    private String modello;
    private float velocita; 
    private float potenza;
    private int numeroRuote;
    private String tipoMotore;
    private float litri100km;

    public MezzoDiTrasporto() {
        marca = "undefined";
        modello = "undefined";
        velocita = 0; 
        potenza = 0;
        numeroRuote = 0;
        tipoMotore = "undefined";
        litri100km = 0;
    }

    public MezzoDiTrasporto(String brand, String model, float speed, float power, int nWheels, String engineType, float liters100k) {
        marca = brand;
        modello = model;
        velocita = speed; 
        potenza = power;
        numeroRuote = nWheels;
        tipoMotore = engineType;
        litri100km = liters100k;
    }

    public abstract float calcoloCarburante();
    public abstract float calcoloPotenzaRuota();
}
