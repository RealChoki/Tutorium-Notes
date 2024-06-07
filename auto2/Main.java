// TODO: package bestimmen
package auto2;

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

        // TODO: Versuche die Methode "starten" für beide Fahrzeuge zu überschreiben. Damit "Das Auto / Lkw wurde gestartet." ausgegeben wird. 
        // TODO: Was passiert? warum? Wie kannst du es korregieren ?
    }
}