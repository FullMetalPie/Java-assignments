public class Motociclo extends Veicolo{
    public Motociclo() {
        super();
    }

    public Motociclo(float speed, float power, int nWheels, String engineType, float litres100km, String brand, String model) {
        super(speed, power, nWheels, engineType, litres100km, brand, model);
    }

    public float calcoloCarburante(float km, float prezzo) {
        return (km * prezzo);
    }
    public float calcoloPotenzaRuota(float power, int nWheels) {
        return (power / nWheels);
    }
}