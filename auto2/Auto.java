// TODO: package bestimmen
package auto2;

// TODO: Erstelle eine abgeleitete Klasse namens "Auto", die von der Klasse "Fahrzeug" erbt.
// TODO: Füge der Klasse "Auto" ein zusätzliches Objekt Attribut "anzahlTueren" hinzu.
public class Auto extends Fahrzeug {
    // TODO: Implementiere das zusätzliche Attribut
    int anzahlTueren;

    // TODO: Implementiere einen Konstruktor für die Klasse "Auto", der sowohl die Object Attribute der Basisklasse als auch das neue Attribut "anzahlTueren" initialisiert.
    public Auto(String marke, int baujahr, int anzahlTueren) {
        // TODO: Rufe den Konstruktor der Basisklasse auf mit "super()"
        super(marke, baujahr);
        this.anzahlTueren = anzahlTueren;
    }

    // TODO: Überschreibe "Override" die Methode "infoAnzeigen()" in der Klasse "Auto", um auch die Anzahl der Türen auszugeben.
    // TODO: Verwende getMarke() und getBaujahr() um die werte zu bekommen.
    @Override
    public void infoAnzeigen() {
        System.out.println("Marke: " + getMarke());
        System.out.println("Baujahr: " + getBaujahr());
        System.out.println("Anzahl Türen: " + anzahlTueren);
    }
}