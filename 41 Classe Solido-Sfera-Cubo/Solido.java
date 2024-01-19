public abstract class Solido {
    /* ATTRIBUTI PRIVATI */
    private double pesoSpecifico;

    /* METODI PUBBLICI */
    public Solido(double pesoSpecifico) {
        this.pesoSpecifico = pesoSpecifico;
    }

    public double getPeso() {
        return pesoSpecifico;
    }

    public abstract double superficie();

    public abstract double volume();

    public double peso() {
        return (volume() * pesoSpecifico);
    }
}