package auto;
public class Auto {
    //? Attribute
    private String marke;
    private String farbe;
    private int geschwindigkeit;

    //? Parameterkonstruktor
    public Auto(String marke, String farbe, int geschwindigkeit) {
        this.marke = marke;
        this.farbe = farbe;
        this.geschwindigkeit = geschwindigkeit;
    }

    //? Getter-Methoden
    public String getMarke() {
        return marke;
    }
    
    public String getFarbe() {
        return farbe;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }
    
    //? Setter-Methoden
    public void setMarke(String marke) {
        this.marke = marke;
    }
    
    public void setFarbe(String neueFarbe) {
        this.farbe = neueFarbe;
    }

    //? Methoden
    public void beschleunigen(int geschwindigkeitsZunahme) {
        this.geschwindigkeit += geschwindigkeitsZunahme;
    }

    public void bremsen(int geschwindigkeitsAbnahme) {
        this.geschwindigkeit -= geschwindigkeitsAbnahme;
        if (geschwindigkeit < 0) {
            geschwindigkeit = 0;
        }
    }

    //? Main-Methode
    public static void main(String[] args) {
        Auto meinAuto = new Auto("Volkswagen", "Blau", 0);
        meinAuto.setMarke("Volkswagen");
        meinAuto.setFarbe("Blau");
        meinAuto.geschwindigkeit = 0;


        System.out.println("Vor Änderungen:");
        System.out.println("Mein Auto - Marke: " + meinAuto.getMarke() +
                ", Farbe: " + meinAuto.getFarbe() +
                ", Geschwindigkeit: " + meinAuto.getGeschwindigkeit());

        meinAuto.beschleunigen(30);

        meinAuto.bremsen(10);

        meinAuto.setFarbe("Rot");

        meinAuto.setMarke("Tesla");

        System.out.println("\nNach Änderungen:");
        System.out.println("Mein Auto - Marke: " + meinAuto.getMarke() +
                ", Farbe: " + meinAuto.getFarbe() +
                ", Geschwindigkeit: " + meinAuto.getGeschwindigkeit());

    }
}
