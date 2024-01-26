public class Cubo extends Solido {
    /* ATTRIBUTI PRIVATI */
    private double lato;

    /* METODI PUBBLICI */
    public Cubo(double pesoSpecifico, double lato) {
        super(pesoSpecifico);
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public double superficie() {
        return (6 * (lato * lato));
    }

    public double volume() {
        return (lato * lato * lato);
    }
}
