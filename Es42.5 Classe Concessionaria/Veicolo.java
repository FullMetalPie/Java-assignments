public abstract class Veicolo extends MezzoDiTrasporto{
    protected float velocita; 
    protected float potenza;
    protected int numeroRuote;
    protected String tipoMotore;
    protected float litri100km;

    public Veicolo() {
        super();
        this.velocita = 0;
        this.potenza = 0;
        this.numeroRuote = 0;
        this.tipoMotore = "undefined";
        this.litri100km = 0;
    }

    public Veicolo(float speed, float power, int nWheels, String engineType, float litres100km, String brand, String model) {
        super(brand, model);
        this.velocita = speed;
        this.potenza = power;
        this.numeroRuote = nWheels;
        this.tipoMotore = engineType;
        this.litri100km = litres100km;
    }

    public abstract float calcoloCarburante(float km, float prezzo);
    public abstract float calcoloPotenzaRuota(float power, int nWheels);
}
