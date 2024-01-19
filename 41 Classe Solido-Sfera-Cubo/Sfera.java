public class Sfera extends Solido {
    /* ATTRIBUTI PRIVATI */
    private double raggio;

    /* METODI PUBBLICI */
    public Sfera(double pesoSpecifico, double raggio) {
        super(pesoSpecifico);
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public double superficie() {
        return ((4.0 * 3.14) * (raggio * raggio));
    }

    public double volume() {
        return ((4.0 / 3.0) * (3.14 * (raggio * raggio * raggio)));
    }
}
