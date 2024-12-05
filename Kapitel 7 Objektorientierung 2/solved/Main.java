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