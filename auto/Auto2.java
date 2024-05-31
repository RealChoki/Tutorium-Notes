package auto;
/* Die Ausgabe kann wie folgt aussehen:

 * Vor Änderungen:
 * Marke: Volkswagen
 * Farbe: Blau
 * Geschwindigkeit: 0
 * 
 * Nach Änderungen:
 * Marke: Tesla
 * Farbe: Rot
 * Geschwindigkeit: 20
 */

public class Auto2 {
    // TODO: 3 Attribute (Marke, Farbe, Geschwindigkeit) definieren
    private String marke;
    private String farbe;
    private int geschwindigkeit;

    // TODO: Einen Konstruktor mit 3 Parametern (Marke, Farbe, Geschwindigkeit) erstellen
    public Auto2(String marke, String farbe, int geschwindigkeit) {
        this.marke = marke;
        this.farbe = farbe;
        this.geschwindigkeit = geschwindigkeit;
    }

    // TODO: 3 getter-Methoden für (Marke, Farbe, Geschwindigkeit) erstellen
    public String getMarke() {
        return marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    // TODO: 2 setter-Methoden für Marke und Farbe erstellen
    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    // TODO: 2 Methoden (beschleunigen, bremsen) erstellen
    public void beschleunigen(int erhöhung) {
        this.geschwindigkeit += erhöhung;
    }

    public void bremsen(int verringerung) {
        this.geschwindigkeit -= verringerung;
        if (this.geschwindigkeit < 0) {
            this.geschwindigkeit = 0;
        }
    }

    public static void main(String[] args) {
        // TODO: Erstellen Sie ein Auto2-Objekt namens meinAuto2 mit dem Konstruktor (z.B. Volkswagen, Blau, 0)
        Auto2 meinAuto2 = new Auto2("Volkswagen", "Blau", 0);

        // TODO: Geben Sie die Attribute des Auto2s auf die Konsole aus
        System.out.println("Vor Änderungen:");
        System.out.println("Marke: " + meinAuto2.getMarke());
        System.out.println("Farbe: " + meinAuto2.getFarbe());
        System.out.println("Geschwindigkeit: " + meinAuto2.getGeschwindigkeit());

        // TODO: Beschleunigen Sie das Auto2 um 30 km/h
        meinAuto2.beschleunigen(30);

        // TODO: Bremsen Sie das Auto2 um 10 km/h
        meinAuto2.bremsen(10);

        // TODO: Lackieren Sie das Auto2 rot
        meinAuto2.setFarbe("Rot");

        // TODO: Ändern Sie die Marke des Auto2s in "Tesla"
        meinAuto2.setMarke("Tesla");

        // TODO: Geben Sie die Attribute des Auto2s nach den Änderungen aus
        System.out.println("\nNach Änderungen:");
        System.out.println("Marke: " + meinAuto2.getMarke());
        System.out.println("Farbe: " + meinAuto2.getFarbe());
        System.out.println("Geschwindigkeit: " + meinAuto2.getGeschwindigkeit());
    }
}
