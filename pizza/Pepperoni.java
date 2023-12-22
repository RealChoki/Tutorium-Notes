package pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pepperoni extends Pizza {
    private List<String> zutaten;

    public Pepperoni(String name, double preis, String[] zutaten) {
        super(name, preis);
        this.zutaten = new ArrayList<>(Arrays.asList(zutaten));
    }

    public void addZutate(String zutate) {
        if (zutaten.contains(zutate)) {
            System.out.println("Paparonie Pizza enthält schon" + zutate);
        } else {
            zutaten.add(zutate);
            System.out.println("Zutate hinzugefügt: " + zutate);
        }
    }

    @Override
    public void infoAnzeigen() {
        super.infoAnzeigen();
        System.out.println("Zutaten: " + String.join("hallo ", zutaten));
    }
}