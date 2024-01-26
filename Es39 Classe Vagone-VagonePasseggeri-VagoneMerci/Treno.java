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
        /* Mancante */
    }
}
