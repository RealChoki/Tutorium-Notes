package pizza;

public class Pepperoni extends Pizza {
    private String[] zutaten;

    public Pepperoni(String name, double preis, String[] zutaten) {
        super(name, preis);
        this.zutaten = zutaten;
    }

    @Override
    public void infoAnzeigen() {
        super.infoAnzeigen();
        System.out.println("Zutaten: " + String.join(", ", zutaten));
    }
}
