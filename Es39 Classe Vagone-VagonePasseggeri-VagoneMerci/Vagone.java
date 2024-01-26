public abstract class Vagone {
    private static int contatore = 0;
    private int codice;
    private double pesoAvuoto;
    private String aziendaCostruttrice;
    private int annoDiCostruzione;

    public Vagone() {
        codice = contatore;
        contatore++;
        pesoAvuoto = 0.0;
        aziendaCostruttrice = "Undefined";
        annoDiCostruzione = 2000;
    }

    public Vagone(double wheight, String company, int year) {
        codice = contatore;
        contatore++;
        pesoAvuoto = wheight;
        aziendaCostruttrice = company;
        annoDiCostruzione = year;
    }

    public int getCodice() {
        return codice;
    }

    public double getPeso() {
        return pesoAvuoto;
    }

    public String getAzienda() {
        return aziendaCostruttrice;
    }

    public int getAnno() {
        return annoDiCostruzione;
    }

    public void setPeso(double wheight) {
        pesoAvuoto = wheight;
    }

    public void setAzienda(String company) {
        aziendaCostruttrice = company;
    }

    public void setAnno(int year) {
        annoDiCostruzione = year;
    }

    public abstract double calcPeso();
}
