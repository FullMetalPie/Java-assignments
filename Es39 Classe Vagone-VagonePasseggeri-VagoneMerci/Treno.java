import java.util.Arrays;

public class Treno {
    private int dimensione;
    private Vagone arrayVagoni[];

    public Treno() {
        dimensione = 0;
        arrayVagoni = new Vagone[dimensione];
    }

    public Treno(int dim) {
        dimensione = dim;
        arrayVagoni = new Vagone[dimensione];
    }

    public void addVagonePasseggeri(VagonePasseggeri vp) {
        arrayVagoni = Arrays.copyOf(arrayVagoni, dimensione + 1);
        arrayVagoni[dimensione - 1] = vp;
    }

    public void addVagoneMerci(VagoneMerci vm) {
        arrayVagoni = Arrays.copyOf(arrayVagoni, dimensione + 1);
        arrayVagoni[dimensione - 1] = vm;
    }

    public void stampa() {
        for (int i = 0; i < dimensione; i++) {
            System.out.println("======================\nVagone " + (i + 1) + ":");
            System.out.println("Codice vagone: " + arrayVagoni[i].getCodice());
            System.out.println("Peso a vuoto: " + arrayVagoni[i].getPeso());
            System.out.println("Azienda costruttrice: " + arrayVagoni[i].getAzienda());
            System.out.println("Anno di costruzione: " + arrayVagoni[i].getAnno());
        }
    }
}
