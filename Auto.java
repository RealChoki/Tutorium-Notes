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
        //TODO Erstellen von Auto-Objekt mit dem Parameterkonstruktor
        Auto meinAuto = new Auto("Volkswagen", "Blau", 0);

        //TODO Ausgabe der Attribute vor den Änderungen
        System.out.println("Vor Änderungen:");
        System.out.println("Mein Auto - Marke: " + meinAuto.getMarke() +
                ", Farbe: " + meinAuto.getFarbe() +
                ", Geschwindigkeit: " + meinAuto.getGeschwindigkeit());

        //TODO Beschleunigen und Bremsen des Autos
        meinAuto.beschleunigen(30);
        meinAuto.bremsen(10);

        //TODO Lackieren des Autos
        meinAuto.setFarbe("Rot");

        //TODO Marke des Autos irgendwie ändern ?
        meinAuto.setMarke("Tesla");

        //TODO Ausgabe der Attribute nach den Änderungen
        System.out.println("\nNach Änderungen:");
        System.out.println("Mein Auto - Marke: " + meinAuto.getMarke() +
                ", Farbe: " + meinAuto.getFarbe() +
                ", Geschwindigkeit: " + meinAuto.getGeschwindigkeit());

    }
}
