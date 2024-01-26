public class VagonePasseggeri extends Vagone {
    private int classe;
    private int nPostiDisponibili;
    private int nPostiOccupati;
    private double pesoXpersona;

    public VagonePasseggeri() {
        super();
        classe = 0;
        nPostiDisponibili = 0;
        nPostiOccupati = 0;
        pesoXpersona = 65;
    }

    public VagonePasseggeri(double wheight, String company, int year, int tier, int avaiableSeats, int occupiedSeats,
            double wheightXperson) {
        super(wheight, company, year);
        classe = tier;
        nPostiDisponibili = avaiableSeats;
        nPostiOccupati = occupiedSeats;
        pesoXpersona = wheightXperson;
    }

    public int getClasse() {
        return classe;
    }

    public int getPostiDisponibili() {
        return nPostiDisponibili;
    }

    public int getPostiOccupati() {
        return nPostiOccupati;
    }

    public void setClasse(int tier) {
        classe = tier;
    }

    public void setPostiDisponibili(int avaiableSeats) {
        nPostiDisponibili = avaiableSeats;
    }

    public void setPostiOccupati(int occupiedSeats) {
        nPostiOccupati = occupiedSeats;
    }

    public double calcPeso() {
        return (this.getPeso() + (nPostiOccupati * pesoXpersona));
    }
}
