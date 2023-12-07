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
        //TODO Erstellen sie ein Auto-Objekt namens meinAuto mit dem Parameterkonstruktor 
        //TODO (Geschwindigkeit = 0, Marke = "Volkswagen", Farbe = "Blau")
        Auto meinAuto = new Auto("Volkswagen", "Blau", 0);

        //TODO Geben sie die Attribute des Autos aus
        System.out.println("Vor Änderungen:");
        System.out.println("Mein Auto - Marke: " + meinAuto.getMarke() +
                ", Farbe: " + meinAuto.getFarbe() +
                ", Geschwindigkeit: " + meinAuto.getGeschwindigkeit());

        //TODO Beschleunigen sie das Auto um 30 km/h
        meinAuto.beschleunigen(30);

        //TODO Bremsen sie das Auto um 10 km/h
        meinAuto.bremsen(10);

        //TODO Lackieren des Autos
        meinAuto.setFarbe("Rot");

        //TODO Marke des Autos irgendwie ändern ?
        meinAuto.setMarke("Tesla");

        //TODO Geben sie die Attribute des Autos nach den Änderungen aus
        System.out.println("\nNach Änderungen:");
        System.out.println("Mein Auto - Marke: " + meinAuto.getMarke() +
                ", Farbe: " + meinAuto.getFarbe() +
                ", Geschwindigkeit: " + meinAuto.getGeschwindigkeit());

    }
}
