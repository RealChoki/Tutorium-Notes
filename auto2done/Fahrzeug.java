// TODO: package bestimmen
package auto2done;

// TODO: Definiere eine Basisklasse namens "Fahrzeug" mit den folgenden Objekt Attributen (marke, baujahr) und einen klassen attribute (static) "anzahlFahrzeuge".
public class Fahrzeug {
    private String marke;
    private int baujahr;
    static int anzahlFahrzeuge;

    // TODO: Implementiere den Konstruktor und initialisiere "anzahlFahrzeuge" im konstruktor.
    public Fahrzeug(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
        // TODO: Erhöhe "anzahlFahrzeuge" jedes Mal, wenn eine neue Instanz "Fahrzeug" erstellt wird.
        anzahlFahrzeuge++;
    }

    // TODO: Implementiere eine Getter methode für 'marke'.
    public String getMarke() {
        return this.marke;
    }

    // TODO: Implementiere Getter methode für 'baujahr'.
    public int getBaujahr() {
        return this.baujahr;
    }

    // TODO: Implementiere eine Methode "infoAnzeigen()", die die Informationen des Fahrzeugs ausgibt (Marke, Baujahr).
    public void infoAnzeigen() {
        System.out.println("Marke: " + marke);
        System.out.println("Baujahr: " + baujahr);
    }

    // TODO: Füge eine "final" Methode "starten" hinzu, die eine Meldung ausgibt, dass das Fahrzeug gestartet wurde.
    public void starten() {
        System.out.println("Das Fahrzeug wurde gestartet.");
    }
}

