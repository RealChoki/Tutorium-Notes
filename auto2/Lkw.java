// TODO: package bestimmen
package auto2;

// TODO: Erstelle eine weitere abgeleitete Klasse namens "Lkw", die ebenfalls von der Klasse "Fahrzeug" erbt. 
// TODO: Füge der Klasse "Lkw" ein zusätzliches Attribut "ladung" hinzu.
public class Lkw extends Fahrzeug {
    // TODO: Implementiere das zusätzliche Attribut
    private double ladung;

    // TODO: Implementiere einen Konstruktor für die Klasse "Lkw", der sowohl die Object Attribute der Basisklasse als auch das neue Attribut "ladung" initialisiert.
    public Lkw(String marke, int baujahr, double ladung) {
        // TODO: Rufe den Konstruktor der Basisklasse auf mit "super()"
        super(marke, baujahr);
        this.ladung = ladung;
    }

    // TODO: Überschreibe "Override" die Methode "infoAnzeigen()" in der Klasse "Auto", um auch die Ladung auszugeben.
    // TODO: Verwende die Methode "infoAnzeigen()" der Oberklasse mit "super.infoAnzeigen()" um die werte (Marke, Baujahr) zu bekommen.
    @Override
    public void infoAnzeigen() {
        super.infoAnzeigen();
        System.out.println("Ladung: " + ladung + " Tonnen");
    }
}