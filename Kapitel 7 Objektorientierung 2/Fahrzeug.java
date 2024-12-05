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




// TODO: Erstelle eine abgeleitete Klasse namens "Auto", die von der Klasse "Fahrzeug" erbt.
// TODO: Füge der Klasse "Auto" ein zusätzliches Objekt Attribut "anzahlTueren" hinzu.
public class Auto extends Fahrzeug {
    private int anzahlTueren;

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

    @Override
    public void starten() {
        System.out.println("Das Auto wurde gestartet.");
    }
}




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

    @Override
    public void starten() {
        System.out.println("Der Lkw wurde gestartet.");
    }
}




/* Die Ausgabe kann wie folgt aussehen:

 * Erstes Fahrzeug:
 * Marke: VW
 * Baujahr: 2022
 * Anzahl Türen: 4
 * 
 * Zweites Fahrzeug:
 * Marke: Mercedes
 * Baujahr: 2021
 * Ladung: 10.5 Tonnen

 * Gesamtanzahl der Fahrzeuge: 2

 * Das Auto wurde gestartet.
 * Der Lkw wurde gestartet.
 */

// TODO: Definiere eine Basisklasse namens "Main" mit einer "main" Methode.
public class Main {
    public static void main(String[] args) {
        // TODO: In der "main" Methode, erstelle Instanzen von "Auto" und "Lkw".
        Auto meinAuto = new Auto("VW", 2022, 4);
        Lkw meinLkw = new Lkw("Mercedes", 2021, 10.5);

        // TODO: Zeige die Informationen der erstellten Fahrzeuge an "infoAnzeigen" mit Uberschriften "Erstes Fahrzeug:" und "Zweites Fahrzeug:".
        System.out.println("Erstes Fahrzeug:");
        meinAuto.infoAnzeigen();

        System.out.println();
        
        System.out.println("Zweites Fahrzeug:");
        meinLkw.infoAnzeigen();

        // TODO: Zeige die Gesamtanzahl der erstellten Fahrzeuge an "anzahlFahrzeuge".
        System.out.println();
        System.out.println("Gesamtanzahl der Fahrzeuge: " + Fahrzeug.anzahlFahrzeuge);

        // TODO: Rufe die Methode "starten" für beide Fahrzeuge auf.
        System.out.println();
        meinAuto.starten();
        meinLkw.starten();

        // TODO: Versuche die Methode "starten" für beide Fahrzeuge zu überschreiben, damit die ausgabe passender für beide Fahrzeuge ist. 
        // TODO: Was passiert? warum? Wie kannst du es korregieren?
        // Was passiert? beide Methoden in den Klassen Auto und Lkw werden mit den Fehler markiert "Cannot override the final method from Fahrzeug"
        // warum? weil die Methode "starten" in der Klasse "Fahrzeug" als "final" deklariert wurde, was bedeutet, dass sie nicht überschrieben oder geändert werden kann.
        // Wie kannst du es korregieren? Entferne das Schlüsselwort "final" von der Methode "starten" in der Klasse "Fahrzeug".
    }
}