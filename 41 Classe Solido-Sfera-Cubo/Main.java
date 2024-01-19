public class Main {
    public static void main(String[] args) {
        double peso = 3.0;
        double r = 5.0;
        double lato = 2.5;
        Sfera s = new Sfera(peso, r);
        Cubo c = new Cubo(peso, lato);

        System.out.println("Superficie sfera: " + s.superficie());
        System.out.println("Superficie cubo: " + c.volume());
    }
}