package pizza;

public class Pizza {
    private String name;
    private double preis;
    private static int anzahlPizzas = 0;

    public Pizza(String name, double preis) {
        this.name = name;
        this.preis = preis;
        anzahlPizzas++;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public void infoAnzeigen() {
        System.out.println("Name: " + name);
        System.out.println("Preis: " + preis);
    }

    public static int getAnzahlPizzas() {
        return anzahlPizzas;
    }
}
