package pizza;

public class Margherita extends Pizza{
    private String[] zutaten;

    public Margherita(String name, double preis, String[] zutaten) {
        super(name, preis);
        this.zutaten = zutaten;
    }

    @Override
    public void infoAnzeigen() {
        super.infoAnzeigen();
        System.out.println("Zutaten: " + String.join(", ", zutaten));
    }
}
